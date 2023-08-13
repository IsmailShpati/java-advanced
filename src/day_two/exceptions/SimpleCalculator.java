package day_two.exceptions;

public class SimpleCalculator implements Calculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        try {
            validateNegativeSubtraction(a, b);
        } catch (RuntimeException e) {
            System.out.println("Negative result thrown.");
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement);
            }
            return 0;
        }
        return a - b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }


    private void validateNegativeSubtraction(double a, double b) {
        if (a < b) {
            throwNegativeResultException();
        }
    }

    private void throwNegativeResultException() {
        throw new RuntimeException("Result can't be negative, first number should be greater " +
                "or equal to the second");
    }

}
