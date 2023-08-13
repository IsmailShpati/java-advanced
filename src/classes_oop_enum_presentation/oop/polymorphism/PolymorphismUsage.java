package classes_oop_enum_presentation.oop.polymorphism;

import classes_oop_enum_presentation.abstract_classes.Person;
import classes_oop_enum_presentation.abstract_classes.Student;
import classes_oop_enum_presentation.abstract_classes.Teacher;
import classes_oop_enum_presentation.abstract_classes.Trainer;

public class PolymorphismUsage {

    public static void main(String[] args) {
        Person[] persons = new Person[100];
        persons[0] = new Student("a", 0, "VIIIA");
        persons[1] = new Teacher("Ta", 1990, "VIII-A");
        persons[2] = new Teacher("Tb", 1980, "VII-A");
        persons[3] = new Student("b", 0, "VIIIA");
        persons[5] = new Student("c", 0, "VIIIA");
        persons[6] = new Trainer("Tra", 1999, "Trainer");


        printPersonInformation(persons);

    }

    public static void printPersonInformation(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getPersonInformation());
        }
    }
}
