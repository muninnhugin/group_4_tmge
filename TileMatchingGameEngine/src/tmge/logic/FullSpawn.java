package tmge.logic;

import java.util.Random;
public class FullSpawn implements TileSpawnLogic{

    Random rn = new Random();
    int n;

    public void spawn(TileMatrix board) throws Exception {
        for (int i = 0; i < board.row ; i++){
            for (int j = 0; j < board.col; j++){

                VisibleTile tile = new VisibleTile();

                tile.setColor(board.COLORS[n]);
                tile.setShape(new Circle()); //circle
                board.setTile(i, j, tile);

                n = rn.nextInt(board.numOfColors);

            }
        }
    }
}
