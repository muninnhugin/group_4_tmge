package tmge;

public class EmptyTile extends Tile {

    EmptyTile(Coordinate coordinate)
    {
        color = "empty";
        this.coordinate = coordinate;
        shape = null;
    }

    public String getColor() {
        return color;
    }

    public Shape getShape() {
        return shape;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

}
