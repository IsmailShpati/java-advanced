package classes_oop_enum_presentation.oop.composition;

public class Human {

    private Heart heart;
    private Arm[] arms = {
            new Arm(120),
            new Arm(120)
    };
    private String name;
    private double height;

    public Human(Heart heart, Arm[] arms, String name, double height) {
        this.heart = heart;
        this.arms = arms;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human " + name +
                " has heart beat rate of " + heart.getBeatsPerMinute() +
                " and " + arms.length + " arms of length " + ((arms[0].getLength() + arms[1].getLength()) / 2) +
                " and a height of: " + height;
    }
}
