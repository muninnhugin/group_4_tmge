package tmge;

import tmge.logic.*;

import java.util.*;

public class TMGE {
   // Logics
   private ArrayList<TileMatchingLogic> matchingLogics = new ArrayList<>();
   private TileSpawnLogic spawn = null;
   private TileDestructionLogic destrction = null;
   private MoveLogic move = null;
   private EndLogic end = null;

   // TMGE Components
   private Scanner in = new Scanner(System.in);
   private InputHandler input = new InputHandler(this, in);
   private PlayerManager playerManager = new PlayerManager(this, in);
   
   // Game Variables
   private TileMatrix matrix = null;
   
   private int currentPlayer = 0;
   private int turn = 0;
   private boolean isOver = false;

   public TMGE(int row, int col, int players) {
      matrix = new TileMatrix(row, col);
      for (int i = 0; i != players; i++) {
         playerManager.makePlayer();
      }
   }

   // SETTERS
   
   // LOGIC
   public void setMatchingLogic(TileMatchingLogic tml) {
      matchingLogics.clear();
      matchingLogics.add(tml);
   }

   public void setMatchingLogic(List<TileMatchingLogic> logics) {
      matchingLogics.clear();
      matchingLogics.addAll(logics);
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

   public void setMoveLogic(MoveLogic ml) {
      move = ml;
   }

   // GAME VARIABLES
   public void setCurrentScore(int score) {
      playerManager.getPlayerList().get(currentPlayer).score = score;
   }

   public void setScore(int player, int score) {
      playerManager.getPlayerList().get(player).score = score;
   }

   public void setEnd(boolean e) {
      isOver = e;
   }

   // GETTERS

   public TileMatrix getMatrix() {
      return matrix;
   }

   public InputHandler getInputHandler() {
      return input;
   }

   public Scanner getInputScanner() {
      return in;
   }

   public int getPlayer() {
      return currentPlayer;
   }

   public int getCurrentScore() {
      return playerManager.getPlayerList().get(currentPlayer).score;
   }

   public int getScore(int player) {
      return playerManager.getPlayerList().get(player).score;
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
         turn++;
         currentPlayer = (currentPlayer + 1) % playerManager.getPlayerList().size();
         Set<Coordinate> moves = move.getMove(this);
         
         Set<Coordinate> matched = new HashSet<>();
         do {
            matched.clear();
            for (TileMatchingLogic tml : matchingLogics) {
               matched.addAll(tml.match(moves, matrix));
            }

            destrction.destroy(matched, this);
            end.check(this);
         } while (matched.size() != 0 && !isOver);
      }
   }
}