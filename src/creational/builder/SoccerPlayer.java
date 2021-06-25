package creational.builder;

public class SoccerPlayer {
    public String playerName;
    public Asset potential;
    public Asset ability;

    public SoccerPlayer(String playerName, Asset potential, Asset ability) {
        this.playerName = playerName;
        this.potential = potential;
        this.ability = ability;
    }


    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "playerName='" + playerName + '\'' +
                ", potential=" + potential +
                ", ability=" + ability +
                '}';
    }
}
