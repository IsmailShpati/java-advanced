package classes_oop_enum_presentation.oop.abstraction;

public class ShapeHandler {

    public static void printShapeDetails(Shape shape) {
        System.out.println("Our shape has an area of: " + shape.calculateArea()
            + " and a perimeter of: " + shape.calculatePerimeter());
    }
}
