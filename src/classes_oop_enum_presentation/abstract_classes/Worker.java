package classes_oop_enum_presentation.abstract_classes;

public abstract class Worker extends Person {

    private String profession;

     Worker(String name, int birthYear, String profession) {
        super(name, birthYear);
         System.out.println("Inside worker constructor");
        this.profession = profession;
    }

    public abstract void work();


}
