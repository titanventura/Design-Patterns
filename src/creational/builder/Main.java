package creational.builder;

public class Main {

    public static void main(String[] args) {
        PlayerAssetBuilder abilityBuilder = new AbilityBuilder();
        PlayerAssetBuilder potentialBuilder = new PotentialBuilder();

        PlayerBuildDirector abilityBuildDirector = new PlayerBuildDirector(abilityBuilder);
        abilityBuildDirector.buildMediocrePlayer();
        Asset ability = abilityBuilder.getInstance();

        PlayerBuildDirector potentialBuildDirector = new PlayerBuildDirector(potentialBuilder);
        potentialBuildDirector.buildLegendaryPlayer();
        Asset potential = potentialBuilder.getInstance();


        SoccerPlayer player = new SoccerPlayer("Renato Sanches", potential, ability);

        System.out.println(player);
    }


//    SoccerPlayer sc =
}
