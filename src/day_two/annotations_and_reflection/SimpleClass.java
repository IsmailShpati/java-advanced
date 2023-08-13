package day_two.annotations_and_reflection;

@ClassDescription(description = "This is a simple class that we are using", priority = 12)
public class SimpleClass {

    private String className;

    public SimpleClass() {
    }

    public SimpleClass(String className) {
        this.className = className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void printSomething() {
        System.out.println("Inside print something");
    }

    private void doSomeCalculation(int a, int b) {
        int sum = a + b;
        System.out.println("Sum " + sum);
    }
}
