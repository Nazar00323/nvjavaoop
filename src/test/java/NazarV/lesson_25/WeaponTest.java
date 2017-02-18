package NazarV.lesson_25;

import org.junit.Test;

public class WeaponTest {
    @Test
    public void Weapones() throws Exception {
        //Приклад поліморфного посилання
        Weapon wp1;// Посилання типу Weapon
        wp1 = new Weapon();
        wp1 = new Automaton();
        wp1 = new Pistol();
        wp1 = new Bow();

        /*Automaton at1;
        at1 = new Automaton();
        at1 = new Weapon();*/

        Weapon[] weapons = new Weapon[4];
        weapons[0] = new Weapon();
        weapons[1] = new Automaton();
        weapons[2] = new Pistol();
        weapons[3] = new Bow();

        for (int i = 0; i <weapons.length ; i++) {
            weapons[i].shoot();
        }


        /*for (Weapon element : weapons) {
            System.out.println(element.toString());
        }*/


    }
}
