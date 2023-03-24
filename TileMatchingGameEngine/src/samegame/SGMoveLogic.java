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
        Coordinate coordinate = getCoordinate();
        selected.add(coordinate);
        return selected;
    }

    private Coordinate getCoordinate()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st coordinate x: ");
        int inputX = input.nextInt();
        System.out.print("Enter 1st coordinate y: ");
        int inputY = input.nextInt();
        return new Coordinate(inputX, inputY);
    }
}
