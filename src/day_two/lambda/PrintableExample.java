package day_two.lambda;

public class PrintableExample {

    public static void main(String[] args) {
        Printable printable = new PrintableImpl();
        printable.print("Ismail");

        Printable annonymousPrintable = new Printable() {
            @Override
            public void print(String name) {
                System.out.println("AnonymousPrintable " + name);
            }
        };
        annonymousPrintable.print("Ismail2");

        Printable printableWithLambda = (name) ->
                System.out.println("Inside lambda implementation " + name);
        printableWithLambda.print("Ismail3");
    }

}
