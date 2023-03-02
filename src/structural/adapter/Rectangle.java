package structural.adapter;

public class Rectangle {
    public void draw(int x, int y, int width, int height){
        System.out.printf("Rectangle with coordinates: " +
                "left-down point (" + x + "," + y + "), " +
                "width: " + width + ", height: " + height
                );
    }
}
