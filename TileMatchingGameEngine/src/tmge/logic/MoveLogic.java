package tmge.logic;

import java.util.*;

import tmge.Coordinate;
import tmge.TMGE;

public interface MoveLogic {
    public Set<Coordinate> getMove(TMGE tmge) throws Exception;
}
