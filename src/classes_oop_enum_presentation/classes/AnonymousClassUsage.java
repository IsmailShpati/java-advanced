package classes_oop_enum_presentation.classes;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClassUsage {

    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Runnable with Anonymous class");
//            }
//        };
//        Runnable runnableWithLambda =
//                () -> System.out.println("Runnable with lambda");


//        runnable.run();
//        runnableWithLambda.run();
//
        String[] students = new String[] {"T1", "C3", "C2", "A"};
        Arrays.sort(students, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Sorted array ascending: " + Arrays.toString(students));

        Arrays.sort(students, (o1, o2) -> o2.compareTo(o1));
        System.out.println("Sorted array descending: " + Arrays.toString(students));


//        Test test = new TestImpl();
//        Test testA = new Test() {
//            @Override
//            public String doSomething(int a) {
//                a += 12;
//                System.out.println();
//                return "DoSomething with a " + a;
//            }
//        };

//        Test testLambda = (parameterA) -> {
//            a += 200;
//            System.out.println("");
//            return "Lambda test " + parameterA;
//        };
//        Test testLambda = (parameterA) -> "Lambda test " + parameterA;
//        System.out.println(test.doSomething(100));
//        System.out.println(testA.doSomething(120));
//        System.out.println(testLambda.doSomething(200));












    }

}
