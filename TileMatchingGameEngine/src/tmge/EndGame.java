package tmge;

public class EndGame {
    boolean isOver = false;

    public void check(TileMatrix matrix) {
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                Coordinate coord = new Coordinate(i, j);
                if (!(matrix.getTile(coord) instanceof EmptyTile)) {
                    return;
                }
            }
        }
        isOver = true;
        return;
    }
}
