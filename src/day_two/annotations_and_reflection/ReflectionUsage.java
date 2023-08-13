package day_two.annotations_and_reflection;


import java.lang.reflect.Method;

public class ReflectionUsage {

    public static void main(String[] args) throws Exception {
        Class<SimpleClass> simpleClazz =
                (Class<SimpleClass>) Class.forName("day_two.annotations_and_reflection.SimpleClass");
        SimpleClass instance = simpleClazz.getConstructor(String.class).newInstance("ClassName");
        instance.printSomething();

        for (Method method : simpleClazz.getDeclaredMethods()) {
            System.out.println(method);
        }

        Method doCalculation = simpleClazz.getDeclaredMethod("doSomeCalculation", int.class, int.class);
        doCalculation.setAccessible(true);
        doCalculation.invoke(instance, 12, 13);
//
        if (simpleClazz.isAnnotationPresent(ClassDescription.class)) {
            ClassDescription classDescription = simpleClazz.getAnnotation(ClassDescription.class);
            System.out.println("Class description: " + classDescription.description());
            System.out.println("Class priority: " + classDescription.priority());
        }

    }

}
