package classes_oop_enum_presentation.abstract_classes;

import java.util.Calendar;

/**
 * A class that can't be instantiated
 * It can have abstract methods (It is okay even if it doesn't)
 * A subclass can extend only one abstract class
 */
public abstract class Person {

    // Can have normal members
    protected String name;
    private int birthYear;

    public String getName() {
        name = "Sir " + name;
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
    }

    Person() {

    }

    // It can have a constructor, but it can only be used by subclasses (Classes that extend this class)
    public Person(String name, int birthYear) {
        System.out.println("Inside person constructor");
        this.name = name;
        this.birthYear = birthYear;
    }


    // An abstract method only declares the method definition
    // The implementation (body of the method) should be on the class that implements it
    // similar to C/C++ header files
    public abstract String getPersonInformation();

}
