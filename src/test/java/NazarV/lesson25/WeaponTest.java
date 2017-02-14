package NazarV.lesson25;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeaponTest {
    @Test
    public void Weapones() throws Exception {
        Weapon wp1;
        wp1 = new Weapon();
        wp1 = new Automaton();
        wp1 = new Pistol();
        wp1 = new Bow();

        Weapon[] staff = new Weapon[4];
        staff[0] = new Weapon();
        staff[1] = new Automaton();
        staff[2] = new Pistol();
        staff[3] = new Bow();

        for (Weapon element : staff) {
            System.out.println(element.toString());
        }
    }
}
