package structural.bridge;

public class Main {
    public static void main(String[] args) {
        ShapeBridge square = new ShapeType(new Square());
        ShapeBridge triangle = new ShapeType(new Triangle());
        square.drawShape_ShapeBridge();
        System.out.println("*****************");
        triangle.drawShape_ShapeBridge();

        ShapeBridge blueColor = new Color(new Blue());
        blueColor.shapeBp.shapeType_IShape();
        blueColor.shapeBp.shapeColor_IShape();

        ShapeBridge redColor = new Color(new Red());
        redColor.shapeBp.shapeType_IShape();
        redColor.shapeBp.shapeColor_IShape();


    }
}
