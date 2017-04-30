package NazarV.lesson_43_abstractFactory.TEAM;

import NazarV.lesson_43_abstractFactory.TEAM.Factory.DeveloperFactory;
import NazarV.lesson_43_abstractFactory.TEAM.Factory.TeamFactory;

public class Runner {
    public static void main(String[] args) {
        DeveloperFactory devFact = TeamFactory.createDev("csharp");
        Ideveloper dev1 = devFact.createDeveloper();
        dev1.writeCode();


    }


}
