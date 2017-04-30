package NazarV.lesson_43_abstractFactory.TEAM.Factory;

import NazarV.lesson_43_abstractFactory.TEAM.CSharp;
import NazarV.lesson_43_abstractFactory.TEAM.Ideveloper;

public class CSharpDeveloperFactory implements DeveloperFactory {
    public Ideveloper createDeveloper() {
        return new CSharp();
    }
}
