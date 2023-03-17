package tmge;

import java.util.ArrayList;

public class SameGame extends TMGE{
    /*
     *Creating a tile
     Board/TileMatrix newBoard = new Board(r,c); constructor takes two parameters
     newBoard.setSpawnLogic(spawnLogic = "fullspawn")
     */
    
    SameGame () throws Exception {
        int gameID; //for real time multiplayer game
        SameGame myGame = new SameGame();

        //WHERE we want the board,
        ArrayList<TileMatchingLogic> tmlList = {new VerticalMatching(), new HorizontalMatching()};
        myGame.setMatchingLogic(tmlList);
        myGame.setTileMatrix(6,6);
        myGame.setSpawnLogic(new FullSpawn());
        myGame.setDestructionLogic(new GravityDestructionLogic());
        myGame.setPlayers(new ArrayList<Player>());
        /* myGame.setGameOver()
            ways to have the game over:
                1. no more same neighboring tiles?
                2. move limit
                3. time limit
        */
        

        
    }




}
