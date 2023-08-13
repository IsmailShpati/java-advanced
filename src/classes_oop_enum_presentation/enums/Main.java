package classes_oop_enum_presentation.enums;

public class Main {

    public static void main(String[] args) {
        System.out.println(DayOfWeek.SATURDAY.ordinal());
        DayOfWeek saturday = DayOfWeek.SATURDAY;
        System.out.println(saturday.add(2) + " " + saturday.add(2).isWeekend());
    }

}
