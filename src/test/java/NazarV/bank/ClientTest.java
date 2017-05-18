package NazarV.bank;

import org.junit.Test;
import java.util.ArrayList;

public class ClientTest {
    @Test
    public void generatePhoneNumberTest() throws Exception {
        ArrayList<Client> clients = new ArrayList<Client>();
        for (int i = 0; i < 10 ; i++) {
            //clients.add(new Client());
            clients.add(Client.createNew());
        }
        for (Client client : clients){
            System.out.println(clients.toString());
        }
    }



    @Test
    public void informationTest() throws Exception {
        ArrayList<Client> clients = new ArrayList<Client>();
        for (int i = 0; i < 10 ; i++) {
            //accounts.add(new Account());
            clients.add(Client.createNew());
        }
        for (Client client : clients){
            System.out.println(clients.toString());
        }
    }

}