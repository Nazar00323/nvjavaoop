package NazarV.lesson_43_abstractFactory.TEAM.Factory;

public class TeamFactory {
    public static DeveloperFactory createDev(String str) {
        if (str.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (str.equalsIgnoreCase("csharp")) {
            return new CSharpDeveloperFactory();
        } else {
            throw new RuntimeException(str + " is not defined");
        }
    }
}
