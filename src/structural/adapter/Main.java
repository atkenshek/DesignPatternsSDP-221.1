package structural.adapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Shape[] shapes = {
            new RectangleAdapter(new Rectangle()),
            new LineAdapter(new Line())
        };

        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;

        for(Shape shape : shapes){
            shape.draw(x1, y1, x2, y2);
            System.out.println();
        }//Update
    }
}
