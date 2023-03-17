public class TicTacToe extends TileMatchingGame{
    TileMatrix matrix;
    TileSpawnLogic spawn;
    TileMatchingLogic match;
    TileDestructionLogic destruct;
    Player player1;
    Player player2;

    TileMatchingGame.setMatchingLogic() = new DiagonalLogic();
    

    
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
}
