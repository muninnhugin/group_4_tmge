package tmge;

import tmge.logic.*;

import java.util.*;

public abstract class TMGE {
   ArrayList<TileMatchingLogic> matchingLogics = new ArrayList<>();
   TileSpawnLogic spawn = null;
   TileDestructionLogic destrction = null;
   EndGame end = null;

   TileMatrix matrix = null;
   InputHandlerLogic input = new InputHandlerLogic();

   public TMGE(int i, int j) {
      matrix = new TileMatrix(i, j);
   }

   public void setMatchingLogic(TileMatchingLogic tml) {
      matchingLogics.clear();
      matchingLogics.add(tml);
   }

   public void setMatchingLogic(ArrayList<TileMatchingLogic> logics) {
      matchingLogics.clear();
      matchingLogics = logics;
   }

   public void setSpawnLogic(TileSpawnLogic tsl) {
      spawn = tsl;
   }

   public void setDestructionLogic(TileDestructionLogic dsl) {
      destrction = dsl;
   }

   public void setEndLogic(EndGame el) {
      end = el;
   }

   // Tick/Update
   // Board init
   // Loop
   // Move -> Flag
   // if Move
   // ^ Match
   // ^ Destruct/Update
   // EndGame Logic/Winner // Try exceptions?
   // ^ Spawn
   // End Loop

   public void run() throws Exception {
      spawn.spawn(matrix);
      while (!end.isOver) {
         Set<Coordinate> moves = new HashSet<>();
         moves.add(input.makeMove());
         
         Set<Coordinate> matched = new HashSet<>();
         do {
            for (TileMatchingLogic tml : matchingLogics) {
               matched.addAll(tml.match(moves, matrix));
            }
            // TODO: Doesn't work
            destrction.destroy(matrix);
            end.check(matrix);
         } while (matched.size() != 0);
      }
   }
}