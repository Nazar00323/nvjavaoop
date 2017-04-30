package NazarV.lesson_43_abstractFactory.TEAM.Factory;

import NazarV.lesson_43_abstractFactory.TEAM.Imanager;
import NazarV.lesson_43_abstractFactory.TEAM.TeamLead;

public class TeamLeadFactory implements ManagerFactory {
    public Imanager createManager() {
        return new TeamLead();
    }
}
