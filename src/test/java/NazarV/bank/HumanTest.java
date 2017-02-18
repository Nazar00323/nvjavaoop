package NazarV.bank;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    // Обєкт підкласу можна використовувати замість любого обєкту суперкласу
    public void polimorfizmTest() throws Exception{

        //Worker wk1; // поліморфна змінна
        /*Worker wk1  = new Worker();
        Cashier ch1 = new Cashier();
        Manager mn1 = new Manager();

        wk1.setBonus();
        ch1.setBonus();
        mn1.setBonus();*/

        Worker[] staff = new Worker[6];
        staff[0] = new Worker();
        staff[1] = new Worker();
        staff[2] = new Cashier();
        staff[3] = new Cashier();
        staff[4] = new Manager();
        staff[5] = new Manager();

        for (int i = 0; i < staff.length; i++) {
            staff[i].setBonus();
        }

        for(Worker element: staff){
            System.out.println(element.toString());
        }


    }

}