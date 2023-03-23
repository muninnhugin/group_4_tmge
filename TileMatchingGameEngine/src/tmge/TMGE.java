package tmge;

import tmge.logic.*;

import java.util.*;

public abstract class TMGE {
   // Logics
   private ArrayList<TileMatchingLogic> matchingLogics = new ArrayList<>();
   private TileSpawnLogic spawn = null;
   private TileDestructionLogic destrction = null;
   private EndLogic end = null;

   // TMGE Components
   private InputHandler input = new InputHandler(this);
   
   // Game Variables
   private TileMatrix matrix = null;
   private int[] ScoreArray = null;
   private int currentPlayer = 0;
   private int turn = 0;
   private boolean isOver = false;

   public TMGE(int i, int j, int players) {
      matrix = new TileMatrix(i, j);
      ScoreArray = new int[players];
      Arrays.fill(ScoreArray, 0);
   }

   // SETTERS
   
   // LOGIC
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

   public void setEndLogic(EndLogic el) {
      end = el;
   }

   // GAME VARIABLES
   public void setCurrentScore(int score) {
      ScoreArray[currentPlayer] = score;
   }

   public void setScore(int player, int score) {
      ScoreArray[player] = score;
   }

   public void setEnd(boolean e) {
      isOver = e;
   }

   // GETTERS

   public TileMatrix getMatrix() {
      return matrix;
   }

   public int getPlayer() {
      return currentPlayer;
   }

   public int getCurrentScore() {
      return ScoreArray[currentPlayer];
   }

   public int getScore(int player) {
      return ScoreArray[player];
   }

   public int getTurn() {
      return turn;
   }

   public boolean checkEnd() {
      return isOver;
   }

   // ROUTINES

   public void run() throws Exception {
      spawn.spawn(matrix);
      while (!isOver) {
         Set<Coordinate> moves = new HashSet<>();
         moves.add(input.makeMove());
         
         Set<Coordinate> matched = new HashSet<>();
         do {
            for (TileMatchingLogic tml : matchingLogics) {
               matched.addAll(tml.match(moves, matrix));
            }

            destrction.destroy(matched, matrix);
            end.check(this);
         } while (matched.size() != 0);
      }
   }
}