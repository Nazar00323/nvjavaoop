package NazarV.lesson_43_abstractFactory.TEAM.Factory;

import NazarV.bank.Manager;

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

    public static ManagerFactory createMan(String str) {
        if (str.equalsIgnoreCase("ProjectManager")) {
            return new ProjectManagerFactory();
        } else if (str.equalsIgnoreCase("TeamLead")) {
            return new TeamLeadFactory();
        } else {
            throw new RuntimeException(str + " is not defined");
        }
    }

    public static TesterFactory createTest(String str) {
        if (str.equalsIgnoreCase("qa")) {
            return new QaTesterFactory();
        } else if (str.equalsIgnoreCase("qc")) {
            return new QcTesterFactory();
        } else {
            throw new RuntimeException(str + " is not defined");
        }
    }

}
