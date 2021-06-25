package creational.factory;

public class SaturnFactory extends PlanetMoonFactory {
    @Override
    public Moon createMoon() {
        return new Titan();
    }
}
