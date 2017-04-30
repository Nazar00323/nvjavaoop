package NazarV.lesson_43_abstractFactory.TEAM.Factory;

import NazarV.lesson_43_abstractFactory.TEAM.Ideveloper;
import NazarV.lesson_43_abstractFactory.TEAM.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    public Ideveloper createDeveloper() {
        return new JavaDeveloper();
    }
}
