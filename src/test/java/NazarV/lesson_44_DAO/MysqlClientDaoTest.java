package NazarV.lesson_44_DAO;

import NazarV.bank.Client;
import org.junit.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class MysqlClientDaoTest {
    @Test
    public void create() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        ClientDao dao = factory.getClientDao(factory.getConnection());
        Client cl = new Client("Nazar","Mykhailiv","0680363051",
                new GregorianCalendar(1998,6,9));
        dao.create(cl);
    }

    @Test
    public void read() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        ClientDao dao = factory.getClientDao(factory.getConnection());
        Client client = dao.read(2);
        System.out.println(client.toString());

    }

    @Test
    public void update() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        ClientDao dao = factory.getClientDao(factory.getConnection());
        Client client = dao.read(2);
        client.setPhone("0971073443");

        dao = factory.getClientDao(factory.getConnection());
        dao.update(client);
        dao = factory.getClientDao(factory.getConnection());
        client = dao.read(2);
        System.out.println(client.toString());

    }

    @Test
    public void delete() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        ClientDao dao = factory.getClientDao(factory.getConnection());
        Client client = dao.read(3);
        dao = factory.getClientDao(factory.getConnection());
        dao.delete(client);


    }

    @Test
    public void getAll() throws Exception {
        MysqlDaoFactory factory = new MysqlDaoFactory();
        ClientDao dao = factory.getClientDao(factory.getConnection());
        ArrayList<Client> clients = dao.getAll();
        for(Client client : clients){
            System.out.println(client.toString());
        }

    }

}