import tmge.logic.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import tmge.*;


public class TestTileMatrix {
    public static void main(String args[]) throws Exception{
        TileMatrix matrix = new TileMatrix(5, 5);
        FullSpawn fp = new FullSpawn();
        System.out.println("Hello, World!");
        fp.spawn(matrix);
        matrix.print();
        Set<Coordinate> toMatch = new HashSet<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st coordinate x: ");
        int inputX = input.nextInt();
        System.out.println("Enter 1st coordinate y: ");
        int inputY = input.nextInt();
        Coordinate c1 = new Coordinate(inputX, inputY);
        System.out.println("Enter 2nd coordinate x: ");
        inputX = input.nextInt();
        System.out.println("Enter 2nd coordinate y: ");
        inputY = input.nextInt();
        Coordinate c2 = new Coordinate(inputX, inputY);
        if (matrix.checkAdjacent(c1, c2)) {
            System.out.println("The chosen tiles are adjacent");
        }
        matrix.swapTiles(c1, c2);
        matrix.print();
        toMatch.add(c1);
        toMatch.add(c2);


        ArrayList<TileMatchingLogic> tmlList = new ArrayList<>();
        TileMatchingLogic hml = new HorizontalMatching(3);
        TileMatchingLogic vml = new VerticalMatching(3);
    //     TileMatchingLogic n = new NeighborMatching();
    //     tmlList.add(n);
        tmlList.add(vml);
        tmlList.add(hml);
    
        LineMatching lineMatching = new LineMatching(tmlList);

        Set<Coordinate> matched = lineMatching.match(toMatch, matrix);

        GravityDestructionLogic upd = new GravityDestructionLogic();
        System.out.println("Matched coordinates: ");
        for(Coordinate coordinate : matched)
        {   
           System.out.println(coordinate.x + ", " + coordinate.y);
        }

        System.out.println("Remove matches");
        upd.destroy(matched, matrix, false);
        matrix.printM(matrix); //for testing
        System.out.println("Respawn empty tiles");
        upd.respawn(matrix);
        matrix.printM(matrix);
    }
}