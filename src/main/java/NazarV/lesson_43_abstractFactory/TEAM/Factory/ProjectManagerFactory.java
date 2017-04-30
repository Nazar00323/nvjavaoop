package NazarV.lesson_43_abstractFactory.TEAM.Factory;

import NazarV.lesson_43_abstractFactory.TEAM.Imanager;
import NazarV.lesson_43_abstractFactory.TEAM.ProjectManager;

public class ProjectManagerFactory implements ManagerFactory {
    public Imanager createManager() {
        return new ProjectManager();
    }
}
