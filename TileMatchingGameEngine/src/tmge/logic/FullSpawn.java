package tmge.logic;

import java.util.Random;
import tmge.*;


public class FullSpawn implements TileSpawnLogic {

    Random rn = new Random();
    int n = VisibleTile.COLORS.length - 1;

    public void spawn(TileMatrix board) throws Exception {
        int idx = n;
        for (int i = 0; i < board.getRow(); i++){
            for (int j = 0; j < board.getColumn(); j++){
                Coordinate coord = new Coordinate(i, j);
                VisibleTile tile = new VisibleTile(VisibleTile.COLORS[idx], new Circle());
                board.setTile(coord, tile);

                idx = rn.nextInt(n);

            }
        }
    }
}
