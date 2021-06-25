package creational.factory;

public class Titan extends Moon {

    public String planetName() {

        return "Saturn";
    }


    @Override
    public Double getRevolvingTime() {
        return 39.4;
    }

    @Override
    public Double getRadius() {
        return 80.0;
    }
}
