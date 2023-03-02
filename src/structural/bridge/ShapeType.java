package structural.bridge;

public class ShapeType extends ShapeBridge{

    public ShapeType(IShape_BP shapeBp) {
        super(shapeBp);
    }

    @Override
    void drawShape_ShapeBridge() {
        System.out.println("Inside the public class Shape, which " +
                "extends ShapeBridge...");
        shapeBp.shapeType_IShape();
    }


    @Override
    void fillColor_ShapeBridge() {
        //DO-NOTHING
    }
}
