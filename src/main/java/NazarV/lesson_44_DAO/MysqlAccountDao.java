package NazarV.lesson_44_DAO;

import NazarV.bank.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class MysqlAccountDao implements AccountDao {
    private Connection connection;

    public MysqlAccountDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Account create(Account account) throws SQLException {
        String INSERT_NEW = "INSERT INTO account(number,password,balance,validity) values(?,?,?,?)";
        PreparedStatement prStatment = null;

        try {
            prStatment = connection.prepareStatement(INSERT_NEW);
            prStatment.setString(1, account.getNumber());
            prStatment.setString(2, account.getPassword());
            prStatment.setDouble(3, account.getBalance());
            prStatment.setDate(4, convertToSqlDate(account.getValidity()));
            prStatment.execute();

            System.out.println("Новий рахунок було створено ");

        } catch (Exception e) {
            System.out.println("Рахунок не було створено");
            System.out.println(e.getMessage());
        } finally {
            if (prStatment != null) {
                prStatment.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return account;
    }

    @Override
    public Account read(int key) throws SQLException {
        String SELECT_QUERY = "SELECT * FROM account WHERE id=?";
        PreparedStatement prStatment = null;
        Account ac = null;
        try {
            prStatment = connection.prepareStatement(SELECT_QUERY);
            prStatment.setInt(1, key);
            ResultSet rs = prStatment.executeQuery();
            while (rs.next()) {
                int tempId = rs.getInt(1);
                String tempNumber = rs.getString(2);
                double tempBalance = rs.getDouble(4);
                String tempPassword = rs.getString(3);
                GregorianCalendar tempDate = convertToGregorianCalendar(rs.getDate(5));
                ac = new Account(tempId, tempNumber, tempBalance, tempPassword, tempDate);
            }

        } catch (SQLException e) {
            System.out.println("Помилка отримання інформації про рахунок по id = " + key);
        } finally {
            if (prStatment != null) {
                prStatment.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        return ac;
    }

    @Override
    public void update(Account account) throws SQLException {
        String UPDATE_QUERY = "UPDATE account SET balance=? WHERE id=?";
        PreparedStatement prStatment = null;

        try {
            prStatment = connection.prepareStatement(UPDATE_QUERY);
            prStatment.setDouble(1, account.getBalance());
            prStatment.setInt(2, account.getId());
            prStatment.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Рахунок не оновлено");
            System.out.println(e.getMessage());

        } finally {
            if (prStatment != null) {
                prStatment.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public void delete(Account account) throws SQLException {
        String DELETE_QUERY = "DELETE FROM account WHERE id = ?";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE_QUERY);
            statement.setInt(1, account.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public ArrayList<Account> getAll() throws SQLException {
        String SELECT_QUERY = "SELECT * FROM account;";
        PreparedStatement statement = null;
        ArrayList<Account> accounts = new ArrayList<Account>();
        try {
            statement = connection.prepareStatement(SELECT_QUERY);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int tempId = rs.getInt(1);
                String tempNumber = rs.getString(2);
                double tempBalance = rs.getDouble(3);
                String tempPassword = rs.getString(4);
                GregorianCalendar tempDate = convertToGregorianCalendar(rs.getDate(5));
                Account ac = new Account(tempId, tempNumber, tempBalance, tempPassword, tempDate);
                accounts.add(ac);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return accounts;
    }

    protected java.util.GregorianCalendar convertToGregorianCalendar(java.sql.Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return gregorianCalendar;
    }

    protected java.sql.Date convertToSqlDate(java.util.GregorianCalendar gregorianCalendar) {
        return new java.sql.Date(gregorianCalendar.getTime().getTime());
    }
}
