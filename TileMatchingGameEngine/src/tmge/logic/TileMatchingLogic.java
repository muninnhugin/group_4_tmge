package tmge.logic;

import java.util.Set;

import tmge.Coordinate;
import tmge.TileMatrix;

public interface TileMatchingLogic {
    public Set<Coordinate> match(Set<Coordinate> coords, TileMatrix board) throws Exception;
}
