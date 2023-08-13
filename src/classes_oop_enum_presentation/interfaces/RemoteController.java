package classes_oop_enum_presentation.interfaces;

/*
 * Can define abstract methods
 * No need to explicitly define methods with "public abstract" as it is implicitly used by default
 * Can only define constant public static values
 */
public interface RemoteController {
    // Same as public static final int SOME_VALUE = 0;
    int SOME_VALUE = 0;


    // Same as public abstract void turnOn();
    void turnOn();
    void turnOff();

    // You can still use default implementations of methods
    default void fullTest() {
        // Can still call the abstract methods as we know the subclasses are enforced to implement them
        turnOn();
        turnOff();
    }

}
