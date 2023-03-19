package tmge;

import tmge.logic.*;
import java.util.ArrayList;

public abstract class TMGE {
   TileMatchingLogic match;
   ArrayList<TileMatchingLogic> logics;
   TileSpawnLogic spawn;

   // TODO: Implement matched tile set.
   TileDestructionLogic destrction = new EmptyDestruction();
   // Ignore spawn logic for now
   TileMatrix matrix = new TileMatrix(3, 3);
   EndGame end = new EndGame();
   InputHandlerLogic input = new InputHandlerLogic();
   

   public void setMatchingLogic(TileMatchingLogic tml){
      match = tml;
   }
   // TODO: Implement matching arraylist
   //public void setMatchingLogic(ArrayList<TileMatchingLogic> logics){
    
   //}

   public void setSpawnLogic(TileSpawnLogic tsl){
      spawn = tsl;
   }

   // Tick/Update
   // Board init
   // Loop
   // Move -> Flag
   // if Move
   // ^ Match
   // ^ Destruct/Update
   //    EndGame Logic/Winner // Try exceptions?
   // ^ Spawn
   // End Loop

   public void run() throws Exception {
      spawn.spawn(matrix);
      while (!end.isOver) {
         Coordinate move = input.makeMove();
         match.match(move, matrix);
         destrction.destroy(matrix);
         end.check(matrix);
         //Missing display
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