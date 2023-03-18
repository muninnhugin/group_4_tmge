package tmge.logic;

import java.util.Random;
import tmge.*;


public class FullSpawn implements TileSpawnLogic {

    Random rn = new Random();
    int n= 4;

    public void spawn(TileMatrix board) throws Exception {
        int idx = n;
        for (int i = 0; i < board.row ; i++){
            for (int j = 0; j < board.col; j++){

                VisibleTile tile = new VisibleTile();

                tile.setColor(board.COLORS[idx]);
                tile.setShape(new Circle()); //circle
                board.setTile(i, j, tile);

                idx = rn.nextInt(n);

            }
        }
    }
}
