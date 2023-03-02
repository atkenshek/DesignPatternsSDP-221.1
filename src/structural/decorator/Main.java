package structural.decorator;

public class Main {
    public static void main(String[] args) {
        IShape circle = new Circle();
        IShape redCircle = new BlueShapeDecorator(new Circle());

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        IShape square = new Square();
        IShape blueSquare = new BlueShapeDecorator(new Square());
        BlueShapeDecorator blueShapeDecorator = new BlueShapeDecorator(square);

        System.out.println("Circle with normal border...");
        circle.drawShape();

        System.out.println("Circle with red border...");
        redCircle.drawShape();
        redShapeDecorator.setRedBorder();

        System.out.println("**********************************");

        System.out.println("Square with normal border...");
        square.drawShape();

        System.out.println("Square with blue border...");
        blueSquare.drawShape();
        blueShapeDecorator.setRedBorder();

    }
}
