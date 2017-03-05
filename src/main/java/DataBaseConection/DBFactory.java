package DataBaseConection;


import java.sql.*;

public class DBFactory {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/bank?useSSL=false";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

    private static final String INSERT_NEW = "INSERT INTO account(number,balance,password) values(?,?,?)";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Неможливо отримати клас драйвера ");
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Успішне підключення до бази данних");
        } catch (SQLException e) {
            System.out.println("Неможливо підключитися до бази данних");
            e.printStackTrace();
        }
        return connection;
    }

    public static void createNewAccount() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        String query = "insert into account " +
                "(number,balance,password) " +
                "values ('6666','500','12345678')";
        try {
            connection = getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Новий рахунок було створено");
        } catch (SQLException e) {
            System.out.println("Рахунок не було створено");
            System.out.println(e.getMessage());

        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public static void createNewAccountPS(String number, Double balance, String password) throws SQLException {
        Connection connection = null;
        PreparedStatement prStatment = null;

        try {
            connection = getConnection();
            prStatment = connection.prepareStatement(INSERT_NEW);
            prStatment.setString(1, number);
            prStatment.setDouble(2, balance);
            prStatment.setString(3, password);
            prStatment.execute();

            System.out.println("Новий рахунок було створено ");
        } catch (SQLException e) {
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
    }

    public static void getAccounts() throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String query = "select * from account ";

        try {
            connection = getConnection();
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            System.out.println("NUMBER\tBALANCE\tPASSWORD");

            while (rs.next()) {
                String tempNumber = rs.getString("number");
                double tempBalance = rs.getDouble("balance");
                String tempPassword = rs.getString("password");
                System.out.println(tempNumber + "\t" + tempBalance + "\t" + tempPassword);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }


    }

    public static void updateDB() throws SQLException {
        /*update clients set name = 'Test' where id=5*/


        Connection connection = null;
        Statement statement = null;
        String query = "update   account set balance ='1000' where number= '5555' ";
        try {
            connection = getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Рахунок було оновлено");
        } catch (SQLException e) {
            System.out.println("Рахунок не оновлено");
            System.out.println(e.getMessage());

        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }


    public static void deleteDB() throws SQLException {
        /*update clients set name = 'Test' where id=5*/


        Connection connection = null;
        Statement statement = null;
        String query = "delete from account where number = '6666'";
        try {
            connection = getConnection();
            statement = connection.createStatement();
            statement.execute(query);
            System.out.println("Рахунок було видалено");
        } catch (SQLException e) {
            System.out.println("Рахунок не видалено");
            System.out.println(e.getMessage());

        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }


}
