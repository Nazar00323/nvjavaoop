package NazarV.bank;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    // Обєкт підкласу можна використовувати замість любого обєкту суперкласу
    public void polimorfizmTest() throws Exception{

        Worker wk1; // поліморфна змінна
        wk1 = new Worker();
        wk1 = new Cashier();
        wk1 = new Manager();

        Worker[] staff = new Worker[3];
        staff[0] = new Worker();
        staff[1] = new Cashier();
        staff[2] = new Manager();

        for(Worker element: staff){
            System.out.println(element.toString());
        }


    }

}