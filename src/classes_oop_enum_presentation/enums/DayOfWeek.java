package classes_oop_enum_presentation.enums;

public enum DayOfWeek {
    MONDAY("Monday"),     // 0
    TUESDAY("Tuesday"),    // 1
    WEDNESDAY("Wednesday"),  // 2
    THURSDAY("Th"),   // 3
    FRIDAY("Fr"),     // 4
    SATURDAY("Saturday", true),   // 5
    SUNDAY("Sunday", true);      // 6

    private final String name;
    private final boolean isWeekend;

    DayOfWeek(String name) {
        this(name, false);
    }

    DayOfWeek(String name, boolean isWeekend) {
        this.name = name;
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public DayOfWeek add(int numberOfDays) {
        int nextDay = (this.ordinal() + numberOfDays) % 7;
        DayOfWeek[] daysOfWeek = DayOfWeek.values();
        return daysOfWeek[nextDay];
    }

}
