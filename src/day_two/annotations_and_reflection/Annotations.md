Annotations
-
A form of metadata that can be added to classes, methods, fields, and other program elements.

Basic functionalities of annotations:
 - Information for the Compiler -> Annotations can provide hints, instructions, or 
additional information to the Java compiler. For example, 
the @Override annotation indicates that a method is intended to 
override a method from a superclass, helping the compiler catch errors 
if the method signature doesn't match correctly. @SuppressWarnings annotation tells the compiler to ignore 
certain warnings

 - Code Generation ->  Some annotations trigger code generation during compilation. Example 
a famous library called Lombok can help you generate getters and setters by annotating one class with
@Data or @Getter, @Setter

 - Runtime Processing -> Annotations can be processed at runtime using reflection. Commonly used in Spring and Spring Boot
In some cases, classes are marked with certain annotation telling the framework that they should be part of the
context. Or for example @Test of JUnit testing which marks a method as a test and tells JUnit that it should be
treated as a test case.

Annotations always start with '@' and they can also take properties.

Annotations are defined similar to interfaces, the only difference is adding an @ sign before the keyword.

public @interface ComponentInfo {
    String name();
    String date();
    int currentRevision();
}

While defining an annotation and its elements ("methods"), we must bear in mind some limitations:
- elements can only return certain types, including:
  - simple types (e.g. int, float, double) and their object-oriented counterparts (e.g. Integer, Double)
  - String class
  - enums
  - other annotations
  - arrays of the types as mentioned above