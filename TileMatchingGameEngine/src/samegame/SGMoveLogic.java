package samegame;

import tmge.*;
import tmge.logic.MoveLogic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SGMoveLogic implements MoveLogic {
    @Override
    public Set<Coordinate> getMove(TMGE tmge) throws Exception {
        Set<Coordinate> selected = new HashSet<>();
        tmge.getMatrix().print();
        Coordinate coordinate = getCoordinate(tmge.getMatrix());
        selected.add(coordinate);
        return selected;
    }

    private Coordinate getCoordinate(TileMatrix tm)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st coordinate x: ");
        int inputX = input.nextInt();
        System.out.print("Enter 1st coordinate y: ");
        int inputY = input.nextInt();
        Coordinate coordinate = new Coordinate(inputX, inputY);
        while(!tm.checkRange(coordinate))
        {
            System.out.println("Invalid range for coordinates, please try again.");
            System.out.print("Enter 1st coordinate x: ");
            inputX = input.nextInt();
            System.out.print("Enter 1st coordinate y: ");
            inputY = input.nextInt();
            coordinate = new Coordinate(inputX, inputY);
        }
        return coordinate;
    }
}
