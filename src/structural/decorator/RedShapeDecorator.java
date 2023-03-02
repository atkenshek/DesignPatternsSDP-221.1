package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(IShape iShape) {
        super(iShape);
    }

    @Override
    public void drawShape() {
        iShape.drawShape();
    }

    public void setRedBorder(){
        System.out.println("Border color: Red");
    }
}
