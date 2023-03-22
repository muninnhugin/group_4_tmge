import tmge.logic.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import tmge.*;


public class TestTileMatrix {
    public static void main(String args[]) throws Exception{
        TileMatrix matrix = new TileMatrix(10, 10);
        FullSpawn fp = new FullSpawn();
        fp.spawn(matrix);
        matrix.print();

        Set<Coordinate> toMatch = new HashSet<>();
        toMatch.add(new Coordinate(3,3));
        TileMatchingLogic hml = new HorizontalMatching(3);
        TileMatchingLogic vml = new VerticalMatching(3);
        ArrayList<TileMatchingLogic> tmlList = new ArrayList<>();
        tmlList.add(hml);
        tmlList.add(vml);
        LineMatching lineMatching = new LineMatching(tmlList);

        Set<Coordinate> matched = lineMatching.match(toMatch, matrix);
        System.out.println("Matched coordinates: ");
        for(Coordinate coordinate : matched)
        {
            System.out.println(coordinate.x + ", " + coordinate.y);
        }
    }


}
