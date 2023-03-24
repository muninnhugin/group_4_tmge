package tmge;

public class TileMatrix {
    private Tile[][] board;
    private int row;
    private int col;

    public TileMatrix(int row, int col) {
        setBoard(new Tile[row][col]);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = new EmptyTile(new Coordinate(i, j));
            }
        }
        this.row = row;
        this.col = col;
    }

    public Tile[][] getBoard() {
        return board;
    }

    public void setBoard(Tile[][] board) {
        this.board = board;
    }

    public void printM(TileMatrix matrix)
    {
        for (int i = 0; i < matrix.getRow(); i++) {
            
            for (int j = 0; j < matrix.getColumn(); j++) {
                //Coordinate coord = new Coordinate(i,j);
                System.out.print(getBoard()[i][j].getColor());
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
        return this.getBoard().length;
    
    }

    public int getColTotal()
    {
       return this.getBoard()[0].length;
    
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.col;
    }

    public void print() {
        int coord = 0;
        System.out.print("    ");
        for (int i = 0; i < row; i++){
            System.out.print(" "+coord+"  ");
            coord++;
        }
        System.out.println("\n");
        coord = 0;
        for (int i = 0; i < row; i++) {
            System.out.print(coord+"  | ");
            for (int j = 0; j < col; j++) {
                System.out.print(this.getBoard()[i][j].getColor()+ "   ");
            }
            System.out.println("\n");
            coord++;
        }
    }

    public void setTile(Coordinate coord, Tile tile) throws Exception {
        getBoard()[coord.x][coord.y] = tile;
    }

    public void swapTiles(Coordinate coord1, Coordinate coord2) throws Exception {
        Tile temp = getTile(coord1);
        setTile(coord1, getTile(coord2));
        setTile(coord2, temp);
    }
    
    //checks if the two inputs from the users are adjacent 
    public boolean checkAdjacent(Coordinate c1, Coordinate c2) {
        int adj = c1.x + c1.y - c2.x - c2.y;
        return (adj == 1 || adj == -1);
    }

    public Tile getTile(Coordinate coord)
    {
        return getBoard()[coord.x][coord.y];
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
