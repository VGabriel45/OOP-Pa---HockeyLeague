import java.util.ArrayList;
import java.util.List;

public abstract class HockeyLeague {
    private List<Team> teams = new ArrayList<Team>();

    public HockeyLeague(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeamsWithSameCoach(Coach coach){
        List<Team> result = new ArrayList<>();
        for (Team team : teams) {
            if (team.getCoach() == coach){
                result.add(team);
            }
        }
        return result;
    }

    public Team getTeamWithMostWins(){
        int wins = teams.get(0).getNumberOfWins();
        Team result = teams.get(0);
        for (Team team : teams) {
            if (team.getNumberOfWins() > wins){
                wins = team.getNumberOfWins();
                result = team;
            }
        }
        return result;
    }

    public void displayTeamWins(){
        for (Team team : teams) {
            System.out.println(team.getName() + " number of wins: " + team.getNumberOfWins());
        }
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
