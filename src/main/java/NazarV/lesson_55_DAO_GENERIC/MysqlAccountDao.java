package NazarV.lesson_55_DAO_GENERIC;


import NazarV.bank.Account;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class MysqlAccountDao extends AbstractDao<Account,Integer> {
    private static final Logger log = Logger.getLogger(MysqlAccountDao.class);
    public MysqlAccountDao(Connection connection) {
        super(connection);
    }


    @Override
    public String getSelectQuery() {
        return "SELECT * FROM account";
    }

    @Override
    public ArrayList<Account> parseResultSet(ResultSet rs) throws DaoException {
        ArrayList<Account>accounts = new ArrayList<Account>();
        try {
            while (rs.next()) {
                int tempId = rs.getInt(1);
                String tempNumber = rs.getString(2);
                double tempBalance = rs.getDouble(4);
                String tempPassword = rs.getString(3);
                GregorianCalendar tempDate = convertToGregorianCalendar(rs.getDate(5));
                Account ac = new Account(tempId, tempNumber, tempBalance, tempPassword, tempDate);
                accounts.add(ac);
            }
        } catch (Exception e) {
            log.error("Неможливо отримати дані з ResultSet");
            log.error(e.getStackTrace());
            throw new DaoException(e);
        }


        return accounts;
    }
}
