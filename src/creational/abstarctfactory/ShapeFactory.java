package creational.abstarctfactory;


public class ShapeFactory extends AbstractFactory {

    @Override
    IShape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("Triangle")){
            return new Triangle();
        } else if (shape.equalsIgnoreCase("Ellipse")) {
            return new Ellipse();
        }
        return null;
    }
}
