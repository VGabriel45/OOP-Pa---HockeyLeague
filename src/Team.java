import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players;
    private String captain;
    private Coach coach;
    private String name;
    private List<Game> record = new ArrayList<>();

    public Team(List<Player> players, String captain, String name) {
        if (players.size() < 6){
            throw new IllegalArgumentException("Enter at least 6 players");
        } else {
            this.players = players;
        }
        this.captain = captain;
        this.name = name;
    }

    public int getNumberOfWins(){
        int countWins = 0;
        for (Game game : record) {
            if (game.getTeam1() == this){
                if(game.getScore1() > game.getScore2()){
                    countWins++;
                }
            } else if (game.getTeam2() == this){
                if(game.getScore2() > game.getScore1()){
                    countWins++;
                }
            }
        }
        return countWins;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getRecord() {
        return record;
    }

    public void setRecord(List<Game> record) {
        this.record = record;
    }
}
