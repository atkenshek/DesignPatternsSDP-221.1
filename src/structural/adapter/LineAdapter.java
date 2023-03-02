package structural.adapter;

public class LineAdapter implements Shape{
    private Line lineAdaptee;

    public LineAdapter(Line lineAdaptee) {
        this.lineAdaptee = lineAdaptee;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        lineAdaptee.draw(x1, y1, x2, y2);
    }
}
