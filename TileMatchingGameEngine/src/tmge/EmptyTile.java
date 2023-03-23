package tmge;

public class EmptyTile extends Tile {

<<<<<<< HEAD
    public EmptyTile()
=======
    EmptyTile(Coordinate coordinate)
>>>>>>> 206d131dd734295f8bdb71772870c3a0d6050366
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
