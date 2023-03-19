package tmge;

public class VisibleTile extends Tile{
    Shape shape;

    public VisibleTile(){}
    VisibleTile(String color, Coordinate coordinate, Shape shape)
    {
        this.color = color;
        this.coordinate = coordinate;
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getColor() {
        return color;
    }

    public Shape getShape() {
        return shape;
    }
}
