package tmge;

public class TileMatrix {
    private Tile[][] board;
    private int row;
    private int col;

    public TileMatrix(int row, int col) {
        board = new Tile[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = new EmptyTile();
            }
        }
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.col;
    }

    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(this.board[i][j].getColor()+ " ");
            }
            System.out.println();
        }
    }

    public void setTile(Coordinate coord, Tile tile) throws Exception {
        board[coord.x][coord.y] = tile;
    }

    public Tile getTile(Coordinate coord)
    {
        return board[coord.x][coord.y];
    }

    public boolean checkRange(Coordinate coord) {
        return (checkXRange(coord.x) && checkYRange(coord.y));
    }

    public Boolean checkYRange(int y){
        return !(y < 0 || y >= row);
    }

    public Boolean checkXRange(int x) {
        return !(x < 0 || x >= col);
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
