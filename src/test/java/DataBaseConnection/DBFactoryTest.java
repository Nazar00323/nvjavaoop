package DataBaseConnection;

import DataBaseConection.DBFactory;
import org.junit.Test;

public class DBFactoryTest {
    @Test

    public void connectionTest()throws Exception{
        DBFactory.getConnection();
    }

    @Test

    public void createTest()throws  Exception{
        DBFactory.createNewAccount();
    }
 }
