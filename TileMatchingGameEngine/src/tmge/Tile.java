package tmge;

public abstract class Tile {
//    public void setTile(String color, Coordinate coordinate, Shape shape);
    String color;
    Shape shape;
    Coordinate coordinate;
    String getColor(){
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Tile)) // We want to do basic comparisons, but symmetry/transitivty is broken.
            return false;
        Tile other = (Tile) obj;
        if (color != other.color)
            return false;
        if (shape.equals(other.shape))
            return false;
        return true;
    }
}
