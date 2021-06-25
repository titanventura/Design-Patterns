package creational.factory;

public class JupiterFactory extends PlanetMoonFactory {

    @Override
    public Moon createMoon() {
        return new Europa();
    }
}
