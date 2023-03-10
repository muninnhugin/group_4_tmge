import java.utils.Random;
public class FullSpawn implements TileSpawnLogic{
    Random rn = new Random();
    int n = rn.nextInt(numOfColors);
    public void spawn(TileMatrix board){
        for (int i = 0; i < board.row ; i++){
            for (int j = 0; j < board.col; j++){

                Tile tile = new VisibleTile();
                //set Tile color? Random
                tile.setColor(COLORS[n]);
                tile.setShape(new Circle());
                board.setTile(i, j, tile);

                n = rn.nextInt(numOfColors);

            }
        }
    }
}
