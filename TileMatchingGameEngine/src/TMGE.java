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
   }

   
}
