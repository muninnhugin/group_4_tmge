import java.util.ArrayList;

public class SameGame extends TileMatchingGame{
    /*
     *Creating a tile
     Board/TileMatrix newBoard = new Board(r,c); constructor takes two parameters
     newBoard.setSpawnLogic(spawnLogic = "fullspawn")
     */
    
    SameGame (){
        ArrayList<TileMatchingLogic> tmlList = {new VerticalMatching(), new HorizontalMatching()};
        TileMatchingLogic tml = new NeighborMatching(tmlList);
        TileSpawnLogic tsl = new FullSpawn();
    }




}
