package tmge;

public class VisibleTile extends Tile{
    // public static final String[] COLORS = {"R", "Y", "G", "B", "P"};
    public static final String[] COLORS = {"O", "X", "+", "#", "A"};

    public VisibleTile(String color, Shape shape)
    {
        this.color = color;
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public Shape getShape() {
        return shape;
    }
}
