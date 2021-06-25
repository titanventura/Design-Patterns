package creational.factory;

import javax.swing.*;

public abstract class Moon {

    public abstract String planetName();

    public String displayString() {
        return String.format("""
                Hey, This is %s. I am from planet %s.
                I revolve around %s in %.2f hours.
                My radius is about %.2f kms.
                """, this.getClass().getSimpleName(), planetName(), planetName(), getRevolvingTime(), getRadius());
    }

    public void revolve() {
        JFrame frame = new JFrame("Planet GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JLabel textLabel = new JLabel(displayString());
        frame.getContentPane().add(textLabel);
        frame.setVisible(true);
    }

    public abstract Double getRevolvingTime();

    public abstract Double getRadius();

}
