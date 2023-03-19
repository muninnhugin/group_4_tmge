package tmge.logic;

import java.util.Set;

import tmge.Coordinate;
import tmge.TileMatrix;

public interface TileMatchingLogic {
    public Set<Coordinate> match(Coordinate coord, TileMatrix board) throws Exception;
}
