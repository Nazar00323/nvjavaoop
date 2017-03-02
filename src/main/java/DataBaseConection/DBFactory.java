package DataBaseConection;


import java.sql.*;

public class DBFactory {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/bank?useSSL=false";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

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
                "values ('1231243423453452456236','0','12345678')";
        try {
            connection = getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Новий рахунок було створено");
        } catch (SQLException e) {
            System.out.println("Рахунок не було створено");
            System.out.println(e.getMessage());

        } finally {
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        }
    }
}
