package structural.decorator;

public class Circle implements IShape{
    @Override
    public void drawShape() {
        System.out.println("IShape :: Circle");
    }
}
