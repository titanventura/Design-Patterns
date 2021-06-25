package creational.factory;

public class Main {
    public static void main(String[] args) {
        String planetName = args[0];
        new Application(planetName).runApp();
    }
}
