package classes_oop_enum_presentation.oop.abstraction;

public class SampleRunner {

    public static void main(String[] args) {
        Shape rec = new Rectangle(12, 20);
        Shape circ = new Circle(12);

        ShapeHandler.printShapeDetails(rec);
        ShapeHandler.printShapeDetails(circ);

    }


}
