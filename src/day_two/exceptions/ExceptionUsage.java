package day_two.exceptions;

public class ExceptionUsage {

    public static void main(String[] args) {
        Calculator calculator = new SimpleCalculator();
        System.out.println(calculator.add(20, 30));
        System.out.println(calculator.add(23, 44));
        System.out.println(calculator.subtract(1, 30));
        System.out.println(calculator.divide(1, 0));

    }

    private static void processAccountEntry(double debitAmount, double creditAmount) throws MisbalanceException {
        if (debitAmount != creditAmount) {
            throw new MisbalanceException("Debit amount "
                    + debitAmount + " is not equal to credit amount " + creditAmount);
        }
        String name = null;
        name.length(); // NullPointerException
    }


//
//    private static void printNameLength(String name)
//            throws IOException, SQLException {
//        System.out.println(name);
//        throw new IOException("IOException thrown");
//    }


//    String name = "";
//    int a = 12;
//        System.out.println("Value a is: " + a);
//        try {
//        System.out.println(name.length());
//        printNameLength(name);
//    } catch (IOException e) {
//        System.out.println("Caught IOException");
//    } catch (SQLException e) {
//        System.out.println("Caught SQLException");
//    } catch (Exception e) {
//        System.out.println("Caught an exception " + e.getMessage());
//    } finally {
//        System.out.println("Finally block executed");
//    }
//        System.out.println("After printNameLength was called");







    // Handling exceptions
    // Try Catch
    // Try Catch with multiple clauses
    // Try Catch with one clause that handles many exceptions
    // Try-Catch-Finally
    // Try with resources


}
