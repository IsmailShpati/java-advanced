package classes_oop_enum_presentation.abstract_classes;

public class Teacher extends Person {

    private String className;

    public Teacher(String name, int birthYear, String className) {
        super(name, birthYear);
        this.className = className;
    }

    public void teach() {
        System.out.println(getName() + " is teaching...");
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String getPersonInformation() {
        return "Teacher " + super.getName() + " is " +
                super.getAge() + " className: " + this.className;
    }
}
