public class SameGame extends TileMatchingGame{
    /*
     *Creating a tile
     Board/TileMatrix newBoard = new Board(r,c); constructor takes two parameters
     newBoard.setSpawnLogic(spawnLogic = "fullspawn")
     */
    
    SameGame (){
        TileMatchingLogic tml = new NeighborMatching();
        TileSpawnLogic tsl = new FullSpawn();
    }

    


}
