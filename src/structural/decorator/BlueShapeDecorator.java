package structural.decorator;

public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(IShape iShape) {
        super(iShape);
    }

    @Override
    public void drawShape() {
        iShape.drawShape();
    }

    public void setRedBorder(){
        System.out.println("Border color: Blue");
    }
}
