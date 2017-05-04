package NazarV.lesson_43_abstractFactory.TEAM;

import NazarV.lesson_43_abstractFactory.TEAM.Factory.DeveloperFactory;
import NazarV.lesson_43_abstractFactory.TEAM.Factory.ManagerFactory;
import NazarV.lesson_43_abstractFactory.TEAM.Factory.TeamFactory;
import NazarV.lesson_43_abstractFactory.TEAM.Factory.TesterFactory;

public class Runner {
    public static void main(String[] args) {
        DeveloperFactory devFact = TeamFactory.createDev("csharp");
        Ideveloper dev1 = devFact.createDeveloper();
        dev1.writeCode();

        ManagerFactory manFact = TeamFactory.createMan("ProjectManager");
        Imanager man1 = manFact.createManager();
        man1.createTask();

        TesterFactory TestFact = TeamFactory.createTest("QaTesterFactory");
        Itester test1 = TestFact.createTester();
        test1.testCode();


    }


}
