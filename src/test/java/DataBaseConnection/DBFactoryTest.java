package DataBaseConnection;

import DataBaseConection.DBFactory;
import org.junit.Test;

public class DBFactoryTest {
    @Test
    public void getAccountsTest() throws Exception {
        DBFactory.getAccounts();
    }

    @Test

    public void connectionTest() throws Exception {
        DBFactory.getConnection();
    }

    @Test

    public void createTest() throws Exception {
        //DBFactory.createNewAccount();
        DBFactory.getAccounts();
        DBFactory.createNewAccountPS("7777", 5000.0, "7777");
        DBFactory.getAccounts();
    }

    @Test

    public void updateDB() throws Exception {

        //DBFactory.updateDB();
        DBFactory.updateDBps(1500, "5555");

    }


    @Test
    public void deleteDB() throws Exception {
        //DBFactory.deleteDB();
        DBFactory.deleteDBPS("6666");
    }


}
