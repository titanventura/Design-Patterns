package creational.factory;

public class Application {

    public PlanetMoonFactory factory;

    public Application(String planetName) {
        switch (planetName) {
            case "Jupiter" -> factory = new JupiterFactory();
            case "Saturn" -> factory = new SaturnFactory();
            case "Earth" -> factory = new EarthFactory();
            default -> throw new RuntimeException("Unknown Planet Name");
        }
    }

    public void runApp() {
        factory.createMoon().revolve();
    }
}
