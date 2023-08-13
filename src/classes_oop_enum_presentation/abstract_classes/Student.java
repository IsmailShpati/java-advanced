package classes_oop_enum_presentation.abstract_classes;

public class Student extends Person {

    private String className;

    public Student(String name, int birthYear, String className) {
        super(name, birthYear);
        this.className = className;
    }

    public void learn() {
        System.out.println(super.getName() + " is learning....");
    }

    @Override
    public String getPersonInformation() {
        return String.format("Student %s is %d years old", super.getName(), super.getAge());
    }

}
