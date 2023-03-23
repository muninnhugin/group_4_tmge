package tmge;

public class TileMatrix {
    private Tile[][] board;
    private int row;
    private int col;

    public TileMatrix(int row, int col) {
        setBoard(new Tile[row][col]);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                getBoard()[i][j] = new EmptyTile();
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
        //java has its own garbage collecting
        getBoard()[coordinate.x][coordinate.y] = new EmptyTile();

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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(this.getBoard()[i][j].getColor()+ " ");
            }
            System.out.println();
        }
    }

    public void setTile(Coordinate coord, Tile tile) throws Exception {
        getBoard()[coord.x][coord.y] = tile;
    }

    public void swapTiles(Coordinate coord1, Coordinate coord2) throws Exception {
        Tile temp = getTile(coord1);
        setTile(coord1, getTile(coord2));
        setTile(coord2, temp);
        System.out.println("coordinate 1: "+ getTile(coord1).coordinate.x + ", "+getTile(coord1).coordinate.y);
        System.out.println("coordinate 2: "+ getTile(coord2).coordinate.x + ", "+getTile(coord2).coordinate.y + "\n");

        getTile(coord1).coordinate = new Coordinate(coord1);
        getTile(coord2).coordinate = new Coordinate(coord2);
        System.out.println("coordinate 1: "+ getTile(coord1).coordinate.x + ", "+getTile(coord1).coordinate.y);
        System.out.println("coordinate 2: "+ getTile(coord2).coordinate.x + ", "+getTile(coord2).coordinate.y + "\n");
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
