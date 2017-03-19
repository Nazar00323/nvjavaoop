package NazarV.lesson_32;

import NazarV.bank.Client;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Serializator {

    private static ArrayList<Client> clients = new ArrayList<Client>();
    private static final Logger log = Logger.getLogger(Serializator.class);

    public static void main(String[] args) {
        clients = (ArrayList<Client>) getData("clients");
        System.out.println("In start: arrayList size = " + clients.size());
        log.info(("In start: arrayList size = "));

        Client cl = new Client();

        cl.setName(JOptionPane.showInputDialog(null, "Введіть імя клієнта"));
        cl.setSurname(JOptionPane.showInputDialog(null, "Введіть прізвище клієнта"));
        clients.add(cl);

        for (Client client : clients) {
            System.out.println(client.toString());
            log.info(client.toString());
        }

        System.out.println("In end: arrayList size = " + clients.size());
        log.info("In end: arrayList size = ");
        saveData("clients", clients);
    }

    private static void saveData(String path, Object obj) {
        try {
            FileOutputStream someFile = new FileOutputStream(path + ".ser");
            ObjectOutputStream someObj = new ObjectOutputStream(someFile);

            someObj.writeObject(obj);

            someFile.close();
            someObj.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        }
    }

    private static Object getData(String path) {
        Object tempObj = null;
        try {
            FileInputStream someFile = new FileInputStream(path + ".ser");
            ObjectInputStream someObj = new ObjectInputStream(someFile);

            tempObj = someObj.readObject();
            someFile.close();
            someObj.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            log.info(e.getMessage());
        }
        return tempObj;
    }
}
