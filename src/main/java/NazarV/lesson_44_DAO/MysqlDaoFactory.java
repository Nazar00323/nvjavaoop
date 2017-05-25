package NazarV.lesson_44_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDaoFactory implements DaoFactory {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://servlab.mysql.ukraine.com.ua:3306/servlab_nv";
    private static String USERNAME = "servlab_nv";
    private static String PASSWORD = "gs2zhrw2";

    @Override
    public Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            Class.forName(DRIVER);
            System.out.println("Отримано драйвер класу");
        } catch (ClassNotFoundException e) {
            System.out.println("Неможливо отримати клас драйвера ");
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Успішне підключення до бази данних");
        } catch (SQLException e) {
            System.out.println("Неможливо підключитися до бази данних");
        }
        return connection;
    }

    @Override
    public AccountDao getAccountDao(Connection connection) throws SQLException {
        return new MysqlAccountDao(connection);
    }

    @Override
    public ClientDao getClientDao(Connection connection) throws SQLException {
        return new MysqlClientDao(connection);
    }
}
