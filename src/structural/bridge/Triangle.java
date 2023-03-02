package structural.bridge;

public class Triangle implements IShape_BP{
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class Triangle, in the" +
                "method -> shapeType_IShape()");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class Triangle, in the" +
                "method -> shapeColor_IShape()");
    }
}
