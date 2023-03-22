package tmge;

public class TileMatrix {
    private Tile[][] board;
    private int row;
    private int col;

    public TileMatrix(int row, int col) {
        board = new Tile[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = new EmptyTile(new Coordinate(i, j));
            }
        }
        this.row = row;
        this.col = col;
    }

    public void printM(TileMatrix matrix)
    {
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                //Coordinate coord = new Coordinate(i,j);
                System.out.print(board[i][j].getColor());
                System.out.print(" ");
            }
            System.out.println("");
    }

    }
    public void setEmpty(Coordinate coordinate)
    {
        board[coordinate.x][coordinate.y] = new EmptyTile(coordinate);

    }

    public int getRowTotal()
    {
        return this.board.length;
    
    }

    public int getColTotal()
    {
       return this.board[0].length;
    
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
}
