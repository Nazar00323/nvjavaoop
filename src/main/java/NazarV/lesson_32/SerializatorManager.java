package NazarV.lesson_32;

import NazarV.bank.Manager;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class SerializatorManager {
    private static ArrayList<Manager> manager = new ArrayList<Manager>();
    private static final Logger log = Logger.getLogger(SerializatorManager.class);

    public static void main(String[] args) {
        manager = (ArrayList<Manager>) getData("Manager");
        System.out.println("In start: arrayList size = " + manager.size());
        log.info(("In start: arrayList size = "));

        Manager mn1 = new Manager();

        mn1.setName(JOptionPane.showInputDialog(null, "Введіть імя клієнта"));
        mn1.setSurname(JOptionPane.showInputDialog(null, "Введіть прізвище клієнта"));
        manager.add(mn1);

        for (Manager manager : manager) {
            System.out.println(manager.toString());
            log.info(manager.toString());
        }

        System.out.println("In end: arrayList size = " + manager.size());
        log.info("In end: arrayList size = ");
        saveData("manager", manager);
    }

    private static void saveData(String path, Object obj) {
        try {
            FileOutputStream someFile = new FileOutputStream(path + ".sermng");
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
