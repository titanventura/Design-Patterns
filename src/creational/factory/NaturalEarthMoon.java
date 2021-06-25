package creational.factory;

import creational.factory.Moon;

public class NaturalEarthMoon extends Moon {
    @Override
    public String planetName() {
        return "Earth";
    }

    @Override
    public Double getRevolvingTime() {
        return 24.0;
    }

    @Override
    public Double getRadius() {
        return 300.0;
    }
}
