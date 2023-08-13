package classes_oop_enum_presentation.classes;

public class OuterClass {


    public static void main(String[] args) {
        new NestedClass();
        (new OuterClass()).new InnerClass();
    }

    public void testingPublicVariable() {
        publicStringVariable = "";
    }

    public static int age = 10;
    public int count = 10;
    public String name;

    public static void print() {
        System.out.println("Hello");
    }
    public void incrementAge() {
        age += 1;
        count += 1;
        System.out.println("Age after increment " + age + " and count"
            + count);
    }

    // Can be accessed anywhere (Within class, within package, outside package, outside package within subclass only)
    public String publicStringVariable;

    // Can be accessed within class, within package and within a subclass that belongs outside the package
    protected double protectedDoubleVariable;

    // Can be accessed within class and within package
    String defaultStringVariable;

    // Can be accessed only within class
    private char privateCharVariable;

    // Static members can be accessed without instantiating the class. Same reference shared between instances.
    public static String publicStaticVariable;

    public static void outerStaticClassMethod() {
        System.out.println("This is a static method on the outer class");
        System.out.println("Can access static members of OuterClass: " + publicStaticVariable);
        System.out.println("But not non-static members...");

    }

    public void outerClassHello(String instanceName) {
        System.out.println("------------------------- " + instanceName + " ----------------------------");
        System.out.println("Hello from OuterClass: " + publicStringVariable);
        System.out.println("My publicStaticVariable: " + publicStaticVariable);
        System.out.println();
    }

    private void outerClassMethod() {
        class LocalClass {
            String a;
            String b;
            LocalClass(String a, String b) {
                this.a = a;
                this.b = b;
            }
        }
        System.out.println("This is a method in the outerClass");
        System.out.println("Can access static and non-static members: " + defaultStringVariable + " " + protectedDoubleVariable);
    }

    // Static nested class

    // Can be instantiated without creating an instance of the outer class
    // and can access all its static-members
    // NestedClass nestedClass = new OuterClass.NestedClass();
    static class NestedClass {

        int testVar;

        void accessMembers() {
            System.out.println("I can access static members of outer class: " + publicStaticVariable);
            System.out.println("I can't access non-static members of outer class :(");
//            System.out.println(protectedDoubleVariable); // Error

            outerStaticClassMethod();
        }

    }

    /*
    * Can be instantiated only by using an instance of the outer class
    * InnerClass innerClass = (new OuterClass()).new InnerClass();
    * or
    * OuterClass outerClass = new OuterClass();
    * InnerClass innerClass = outerClass.new InnerClass();
    *
    * Can access all members (static and non-static) of outer class (Attributes and methods)
   */
    class InnerClass {

        void accessMembers() {
            System.out.println("I can access static members of outer class: " + publicStaticVariable);
            System.out.println("I can also access non-static members of outer class: " + privateCharVariable);
            outerClassMethod();
        }

    }


}
