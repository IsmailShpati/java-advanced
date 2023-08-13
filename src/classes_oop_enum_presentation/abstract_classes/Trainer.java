package classes_oop_enum_presentation.abstract_classes;

public class Trainer extends Worker {

    public Trainer(String name, int birthYear, String profession) {
        super(name, birthYear, profession);
        System.out.println("Inside trainer constructor");
    }

    @Override
    public String getPersonInformation() {
        class Pair {
            String a;
            String b;
            public String aAndB() {
                return a + " and " + b;
            }
        }
        Pair pair = new Pair();
        pair.a = "A";
        pair.b = "B";


        return null;
    }

    @Override
    public void work() {

    }
}
