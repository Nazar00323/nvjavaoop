package NazarV.lesson_44_DAO;

import NazarV.bank.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class MysqlClientDao implements ClientDao {
    private Connection connection;

    public MysqlClientDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Client create(Client client) throws SQLException {
        String INSERT_NEW = "INSERT INTO client(client_name, client_surname, client_phone, client_born_date) values(?,?,?,?)";
        PreparedStatement prStatment = null;

        try {
            prStatment = connection.prepareStatement(INSERT_NEW);

            prStatment.setString(1, client.getName());
            prStatment.setString(2, client.getSurname());
            prStatment.setString(3, client.getPhone());
            prStatment.setDate(4, convertToSqlDate(client.getBornDate()));
            prStatment.execute();
            System.out.println(" Створено нового клієнта ");

        } catch (Exception e) {
            System.out.println("Клієнта не було створено");
            System.out.println(e.getMessage());
        } finally {
            if (prStatment != null) {
                prStatment.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return client;
    }

    @Override
    public Client read(int key) throws SQLException {
        String SELECT_QUERY = "SELECT * FROM client WHERE client_id=?";
        PreparedStatement prStatment = null;
        Client cl = null;
        try {
            prStatment = connection.prepareStatement(SELECT_QUERY);
            prStatment.setInt(1, key);
            ResultSet rs = prStatment.executeQuery();
            while (rs.next()) {
                int tempId = rs.getInt(1);
                String tempName = rs.getString(2);
                String tempSurname = rs.getString(3);
                String tempPhone = rs.getString(4);
                GregorianCalendar tempBoornDate = convertToGregorianCalendar(rs.getDate(5));
                cl = new Client( tempId,tempName,tempSurname,tempPhone,tempBoornDate);
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

        return cl;
    }

    @Override
    public void update(Client client) throws SQLException {
        String UPDATE_QUERY = "UPDATE client " +
                "SET client_name=?, client_surname=?,client_phone=?,client_born_date=? WHERE client_id=?";
        PreparedStatement prStatment = null;

        try {
            prStatment = connection.prepareStatement(UPDATE_QUERY);
            prStatment.setString(1, client.getName());
            prStatment.setString(2, client.getSurname());
            prStatment.setString(3, client.getPhone());
            prStatment.setDate(4, convertToSqlDate(client.getBornDate()));
            prStatment.setInt(5,client.getId());
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
    public void delete(Client client) throws SQLException {
        String DELETE_QUERY = "DELETE FROM client WHERE client_id = ?";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE_QUERY);
            statement.setInt(1, client.getId());
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
    public ArrayList<Client> getAll() throws SQLException {
        String SELECT_QUERY = "SELECT * FROM client;";
        PreparedStatement statement = null;
        ArrayList<Client> clients = new ArrayList<Client>();
        try {
            statement = connection.prepareStatement(SELECT_QUERY);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int tempId = rs.getInt(1);
                String tempName = rs.getString(2);
                String tempSurname = rs.getString(3);
                String tempPhone = rs.getString(4);
                GregorianCalendar tempBoornDate = convertToGregorianCalendar(rs.getDate(5));
                Client cl = new Client( tempId,tempName,tempSurname,tempPhone,tempBoornDate);
                clients.add(cl);
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
        return clients;
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
