import tmge.logic.*;

import java.util.Set;

import tmge.*;


public class TestTileMatrix {
    public static void main(String args[]) throws Exception{
        TileMatrix matrix = new TileMatrix(5, 5);
        FullSpawn fp = new FullSpawn();
        fp.spawn(matrix);
        matrix.print();

        TileMatchingLogic hml = new HorizontalMatching();
        TileMatchingLogic vml = new VerticalMatching();
        Set<Coordinate> matched = hml.match(new Coordinate(3,3), matrix);
        matched.addAll(vml.match(new Coordinate(3,3), matrix));
        for(Coordinate coord : matched)
        {
            System.out.print("matching coordinates are: " + coord.x +", "+ coord.y + " \n");
        }
        System.out.println();
    }


}
