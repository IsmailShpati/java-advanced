package classes_oop_enum_presentation.interfaces;

public class InterfacesMain {

    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController();
        tvRemoteController.fullTest();

        System.out.println(RemoteController.SOME_VALUE);
    }

}
