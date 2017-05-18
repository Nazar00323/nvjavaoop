package NazarV.lesson_44_DAO;

import NazarV.bank.Account;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class MysqlAccountDaoTest {
    @Test
    public void create() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        Connection connection = factory.getConnection();
        AccountDao accountDao = factory.getAccountDao(connection);
        Account account = new Account();
        accountDao.create(account);
    }

    @Test
    public void read() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        Connection connection = factory.getConnection();
        AccountDao accountDao = factory.getAccountDao(connection);
        Account account = accountDao.read(5);
        System.out.println(account.toString());
    }

}