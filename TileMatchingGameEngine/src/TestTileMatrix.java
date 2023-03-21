import tmge.logic.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import tmge.*;


public class TestTileMatrix {
    public static void main(String args[]) throws Exception{
        TileMatrix matrix = new TileMatrix(5, 5);
        FullSpawn fp = new FullSpawn();
        fp.spawn(matrix);
        matrix.print();

        Set<Coordinate> toMatch = new HashSet<>();
        toMatch.add(new Coordinate(3,3));
        
        TileMatchingLogic hml = new HorizontalMatching();
        TileMatchingLogic vml = new VerticalMatching();
        //TileMatchingLogic n = new NeighborMatching();
        ArrayList<TileMatchingLogic> tmlList = new ArrayList<>();
        //tmlList.add(n);
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
