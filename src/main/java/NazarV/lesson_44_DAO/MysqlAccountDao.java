package NazarV.lesson_44_DAO;

import NazarV.bank.Account;

import java.sql.*;
import java.util.ArrayList;

public class MysqlAccountDao implements AccountDao {
    private Connection connection;

    public MysqlAccountDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Account create(Account account) throws SQLException {
        String INSERT_NEW = "INSERT INTO Account(number,password,balance) values(?,?,?)";
        PreparedStatement prStatment = null;

        try {
            prStatment = connection.prepareStatement(INSERT_NEW);
            prStatment.setString(1, account.getNumber());
            prStatment.setString(2, account.getPassword());
            prStatment.setDouble(3, account.getBalance());
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
        String SELECT_QUERY = "SELECT * FROM Account WHERE id=?";
        PreparedStatement prStatment = null;
        Account ac = null;
        try {
            prStatment = connection.prepareStatement(SELECT_QUERY);
            prStatment.setInt(1, key);
            ResultSet rs = prStatment.executeQuery();
            while (rs.next()){
                int tempId  = rs.getInt(1);
                String tempNumber = rs.getString(2);
                double tempBalance = rs.getDouble(3);
                String tempPassword = rs.getString(4);
                ac = new Account(tempId,tempNumber,tempBalance,tempPassword);

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

    }

    @Override
    public void delete(Account account) throws SQLException {

    }

    @Override
    public ArrayList<Account> getAll() throws SQLException {
        return null;
    }
}
