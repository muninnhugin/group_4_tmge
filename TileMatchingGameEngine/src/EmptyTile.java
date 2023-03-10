public class EmptyTile extends Tile {
    String color;
    Coordinate coordinate;
    Shape shape;

    EmptyTile()
    {
        color = "";
        coordinate = new Coordinate(-1, -1);
//        shape = new Shape();
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
