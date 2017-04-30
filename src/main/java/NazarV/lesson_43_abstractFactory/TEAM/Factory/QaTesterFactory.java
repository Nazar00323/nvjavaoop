package NazarV.lesson_43_abstractFactory.TEAM.Factory;


import NazarV.lesson_43_abstractFactory.TEAM.Itester;
import NazarV.lesson_43_abstractFactory.TEAM.QaTester;

public class QaTesterFactory  implements TesterFactory{
    public Itester createTester() {
        return new QaTester();
    }
}
