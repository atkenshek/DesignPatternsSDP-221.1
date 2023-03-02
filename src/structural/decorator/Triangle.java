package structural.decorator;

public class Triangle implements IShape{
    @Override
    public void drawShape() {
        System.out.println("IShape :: Triangle");
    }
}
