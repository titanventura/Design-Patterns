package creational.factory;

public class EarthFactory extends PlanetMoonFactory{

    @Override
    public Moon createMoon() {
        return new NaturalEarthMoon();
    }
}
