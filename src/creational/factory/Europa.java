package creational.factory;

public class Europa extends Moon {

    @Override
    public String planetName() {
        return "Jupiter";
    }

    @Override
    public Double getRevolvingTime() {
        return 15.6;
    }

    @Override
    public Double getRadius() {
        return 39.7;
    }
}
