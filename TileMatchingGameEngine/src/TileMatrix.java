public class TileMatrix {
    Tile[][] board;
    int row;
    int col;

    String[] COLORS = {"R","Y","G","B","P"};
    int numOfColors;

    public void setNumOfColors(int n) {
        numOfColors = n;
    }

    TileMatrix(int row, int col) throws Exception {
        if (row == 0 || col == 0) throw new Exception();
        board = new Tile[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = new EmptyTile();
            }
        }
        this.row = row;
        this.col = col;
    }

    void setTile(int row, int col, Tile tile) throws Exception {
        if (row < 0 || row >= board.length) throw new Exception();
        if (col < 0 || col >= board[0].length) throw new Exception();
        board[row][col] = tile;
    }

    Tile getTile(int row, int col) throws Exception {
        if (row < 0 || row >= board.length) throw new Exception();
        if (col < 0 || col >= board[0].length) throw new Exception();
        return board[row][col];
    }

    // Any logic more complex like spawn patterns, initialization should be done in the appropriate logic classes.
    

    /*  if fullspawn(Randomized tiles){
        for i in range row:
            for j in range col:
                random color
                board[i][j].setTile(new Tile(color))
    }

    [[Tile(yellow), Tile(red)],
    [],
    []]


    
    */  

}
