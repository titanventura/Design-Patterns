package creational.builder;

public class AbilityBuilder extends PlayerAssetBuilder {
    @Override
    void reset() {
        this.asset = new Ability();
    }
}
