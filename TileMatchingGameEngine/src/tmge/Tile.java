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
        if (getClass() != obj.getClass())
            return false;
        Tile other = (Tile) obj;
        if (color != other.color)
            return false;
        if (shape != other.shape)
            return false;
        if (!coordinate.equals(other.coordinate))
            return false;
        return true;
    }
}
