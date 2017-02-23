package NazarV.bank;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    // Обєкт підкласу можна використовувати замість любого обєкту суперкласу
    public void polimorfizmTest() throws Exception {

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

        for (Worker element : staff) {
            System.out.println(element.toString());
        }
    }

    @Test //TODO Task 2601
    public void testRaiseSalary() throws Exception {
        Worker staff[] = {new Worker(), new Cashier(), new Manager()};

        for (Worker element : staff) {
            element.decreaseSalary();
        }

        for (int i = 0; i < staff.length; i++) {
            double koef = 0;
            switch (i) {
                case 0:
                    koef = 0.05;
                    break;
                case 1:
                    koef = 0.10;
                    break;
                case 2:
                    koef = 0.15;
                    break;
            }
            double restoredValue = staff[i].getSalary() + staff[i].getSalary() * koef;
            double actualValue = staff[i].getSalary();

            assertEquals(restoredValue, actualValue, restoredValue * koef);
        }
    }

    @Test
    public void callMethodTest() throws Exception {
        Human hm = new Human();
        hm.setSurname();
        hm.setSurname("Nazar");
        hm.setSurname("Nazar", 1);
        /*
        1. Перевірка типу обєкту. -> 2
        2. Перевірка імені методу -> Отримується список методів класу ->
        3. Перевірка аргументів які передаються в метод
        4. Динамічне звязування - метод який викликається визначається
         */

    }
}