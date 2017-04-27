package NazarV.lesson_42_fabryc_method;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Service> stock = new ArrayList<Service>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Стільце №" + (i + 1));
            stock.add(Factory.serviceRun(new ImplAFactory()));
            System.out.println("Виконано");
            System.out.println("-----------------------");
        }



        //Factory.serviceRun(new ImplBFactory());
    }
}
