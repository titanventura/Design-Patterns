package creational.builder;

public class PotentialBuilder extends PlayerAssetBuilder {


    @Override
    void reset() {
        this.asset = new Potential();
    }
}
