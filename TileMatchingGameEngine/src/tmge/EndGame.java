package tmge;

public class EndGame {
    boolean isOver = false;

    public void check(TileMatrix matrix) {
        for (int i = 0; i < matrix.row; i++) {
            for (int j = 0; j < matrix.col; j++) {
                if (!(matrix.getTile(i, j) instanceof EmptyTile)) {
                    return;
                }
            }
        }
        isOver = true;
        return;
    }
}
