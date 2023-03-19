package tmge;

public class TileMatrix {
    public Tile[][] board;
    public int row;
    public int col;

    public String[] COLORS = {"R","Y","G","B","P"};
    public int numOfColors;

    public void setNumOfColors(int n) {
        numOfColors = n;
    }

    public TileMatrix(int row, int col) {
        //if (row == 0 || col == 0) throw new Exception();
        board = new Tile[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = new EmptyTile();
            }
        }
        this.row = row;
        this.col = col;
    }

    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(this.board[i][j].getColor()+ " ");
            }
            System.out.println();
        }
    }
    public void setTile(int row, int col, Tile tile) throws Exception {
        if (row < 0 || row >= board.length) throw new Exception();
        if (col < 0 || col >= board[0].length) throw new Exception();
        board[row][col] = tile;
    }

    public Boolean checkYRange(int y){
        return !(y < 0 || y >= row);
    }

    public Boolean checkXRange(int x) {
        return !(x < 0 || x >= col);
    }
    
    public Boolean isSameColor(Tile x, Tile y)
    {
        System.out.print("The color is " + y.color + "\n");

        return x.color.equals(y.color);
    }

    public Tile getTile(Coordinate coord)
    {
        return board[coord.x][coord.y];
    }

    Tile getTile(int row, int col){
        //if (row < 0 || row >= board.length) throw new Exception();
        //if (col < 0 || col >= board[0].length) throw new Exception();
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
