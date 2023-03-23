package tmge;

public class EmptyTile extends Tile {

    EmptyTile(Coordinate coordinate)
    {
        color = "empty";
        shape = null;
    }

    public String getColor() {
        return color;
    }

    public Shape getShape() {
        return shape;
    }

}
