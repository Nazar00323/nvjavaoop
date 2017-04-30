package NazarV.lesson_43_abstractFactory.TEAM.Factory;

import NazarV.lesson_43_abstractFactory.TEAM.Itester;
import NazarV.lesson_43_abstractFactory.TEAM.QcTester;

public class QcTesterFactory implements TesterFactory {
    public Itester createTester() {
        return new QcTester();
    }
}
