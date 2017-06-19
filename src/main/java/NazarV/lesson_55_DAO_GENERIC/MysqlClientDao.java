package NazarV.lesson_55_DAO_GENERIC;

import NazarV.lesson_40.Client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MysqlClientDao extends AbstractDao<Client,Integer> {
    public MysqlClientDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getSelectQuery() {
        return "SELECT * FROM client";
    }

    @Override
    public ArrayList<Client> parseResultSet(ResultSet rs) throws DaoException {
        return null;
    }
}
