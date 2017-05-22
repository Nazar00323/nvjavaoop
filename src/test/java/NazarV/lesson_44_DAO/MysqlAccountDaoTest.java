package NazarV.lesson_44_DAO;

import NazarV.bank.Account;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class MysqlAccountDaoTest {

    @Test
    public void update() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        AccountDao dao = factory.getAccountDao(factory.getConnection());

        Account account = dao.read(5);
        account.putMoney(200);

        dao = factory.getAccountDao(factory.getConnection());
        dao.update(account);

        dao = factory.getAccountDao(factory.getConnection());
        account = dao.read(5);
        System.out.println(account.toString());
    }

    @Test
    public void delete() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        AccountDao dao = factory.getAccountDao(factory.getConnection());
        Account account = dao.read(5);
        dao = factory.getAccountDao(factory.getConnection());
        dao.delete(account);

    }

    @Test
    public void getAll() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        AccountDao dao = factory.getAccountDao(factory.getConnection());
        ArrayList<Account> accounts = dao.getAll();
        for (Account account : accounts){
            System.out.println(account.toString());
        }
    }

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