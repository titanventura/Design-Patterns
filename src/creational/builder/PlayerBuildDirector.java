package creational.builder;

import java.util.Random;

public class PlayerBuildDirector {
    public PlayerAssetBuilder builder;

    public PlayerBuildDirector(PlayerAssetBuilder assetBuilder) {
        builder = assetBuilder;
    }

    public Integer getRandomIntegerWithinRange(Integer i1, Integer i2) {
        int higher = i1 > i2 ? i1 : i2;
        int lower = i1 + i2 - higher;
        return lower + new Random().nextInt(higher - lower);
    }

    public void buildWorstPlayer() {
        builder.setShooting(
                getRandomIntegerWithinRange(40, 60)
        );
        builder.setPassing(
                getRandomIntegerWithinRange(40, 60)
        );
        builder.setDribbling(
                getRandomIntegerWithinRange(40, 60)
        );
    }

    public void buildMediocrePlayer() {
        builder.setShooting(
                getRandomIntegerWithinRange(60, 75)
        );
        builder.setPassing(
                getRandomIntegerWithinRange(60, 75)
        );
        builder.setDribbling(
                getRandomIntegerWithinRange(60, 75)
        );
    }

    public void buildLegendaryPlayer() {
        builder.setShooting(
                getRandomIntegerWithinRange(75, 94)
        );
        builder.setPassing(
                getRandomIntegerWithinRange(75, 94)
        );
        builder.setDribbling(
                getRandomIntegerWithinRange(75, 94)
        );
    }

}
