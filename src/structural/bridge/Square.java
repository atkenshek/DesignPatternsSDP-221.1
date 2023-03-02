package structural.bridge;

import creational.abstarctfactory.IShape;

public class Square implements IShape_BP {
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class Square, in the" +
                "method -> shapeType_IShape()");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class Square, in the" +
                "method -> shapeColor_IShape()");
    }
}
