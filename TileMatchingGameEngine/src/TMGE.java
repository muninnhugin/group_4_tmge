import java.util.ArrayList;

abstract class TMGE {

   public void setMatchingLogic(TileMatchingLogic tml){

   }
   public void setMatchingLogic(ArrayList<TileMatchingLogic> logics){
    
   }

   public void setSpawnLogic(TileSpawnLogic tsl){

   }

   public void run(){

      makeMove(Coordinate coord){
      // makemove, match, destruct, winner, spawn.
      }


   /*
       public void run() {
        // Load player data.
        player1 = new Player();
        player2 = new Player();
        matrix = new TileMatrix(3, 3);
        spawn = new PlaceLogic(matrix); // Placeholder name.
        match = new TicTacToeMatch(matrix) // Placeholder name.
        spawn.init();
        String move;
        boolean win;
        while (true) {
            move = player1.getInput(); // Could replace w/ move object?
            win = match.makeMove(move); // How can match determine who wins? Are they responsible for it or someone else.
            if (win) break;
            spawn.makeMove(move);
            boolean end = match.makeMove(move);
            if (end) break;
            spawn.makeMove(move);
        }
    }
    */
   }


   protected void setTileMatrix(int row, int col) throws Exception {
      TileMatrix board = new TileMatrix(row, col);
   }
}
