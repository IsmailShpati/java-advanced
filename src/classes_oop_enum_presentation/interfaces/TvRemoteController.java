package classes_oop_enum_presentation.interfaces;

public class TvRemoteController implements RemoteController {

    @Override
    public void turnOn() {
        System.out.println("Turning on TV ");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off TV");
    }

    @Override
    public void fullTest() {
        System.out.println("Tv full test");
        turnOn();
        turnOff();
    }
}
