import tmge.logic.*;

import java.util.Set;

import tmge.*;


public class TestTileMatrix {
    public static void main(String args[]) throws Exception{
        TileMatrix matrix = new TileMatrix(5, 5);
        FullSpawn fp = new FullSpawn();
        fp.spawn(matrix);
        matrix.print();

        TileMatchingLogic tml = new HorizontalMatching();
        Set<Coordinate> matched = tml.match(new Coordinate(3,3), matrix);
        for(Coordinate coord : matched)
        {
            System.out.print("matching coordinates are: " + coord.x +", "+ coord.y + " \n");
        }
        System.out.println();
    }


}
