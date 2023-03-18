import tmge.logic.*;
import tmge.TileMatrix;


public class TestTileMatrix {
    public static void main(String args[]) throws Exception{
        TileMatrix matrix = new TileMatrix(3, 3);
        FullSpawn fp = new FullSpawn();
        fp.spawn(matrix);
        matrix.print();
    }

}
