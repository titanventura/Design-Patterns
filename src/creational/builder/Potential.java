package creational.builder;

public class Potential extends Asset {
    @Override
    public String toString() {
        return String.format("""
                I have an ABILITY of %d Shooting, %d Passing, %d Dribbling.
                        """, getShooting(), getPassing(), getDribbling());
    }
}
