import java.util.ArrayList;
import java.util.List;

public class Coach extends People {
    private Accreditation accreditation;
    private int experience;
    private List<Team> teamsCoached = new ArrayList<>();

    public Coach(Accreditation accreditation, int experience) {
        this.accreditation = accreditation;
        this.experience = experience;
    }

    public Accreditation getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(Accreditation accreditation) {
        this.accreditation = accreditation;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<Team> getTeamsCoached() {
        return teamsCoached;
    }

    public void setTeamsCoached(List<Team> teamsCoached) {
        this.teamsCoached = teamsCoached;
    }
}
