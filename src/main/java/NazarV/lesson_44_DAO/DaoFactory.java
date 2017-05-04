package NazarV.lesson_44_DAO;

import java.sql.Connection;
import java.sql.SQLException;

public interface DaoFactory {
    public Connection getConnection() throws SQLException;

    public AccountDao getAccountDao(Connection connection) throws SQLException;

}
