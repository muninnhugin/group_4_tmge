package tmge.logic;

import tmge.Coordinate;
import tmge.TileMatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LineMatching implements TileMatchingLogic{
    List<TileMatchingLogic> tmlList;
    public LineMatching(ArrayList<TileMatchingLogic> tmlList)
    {
        this.tmlList = tmlList;
    }

    @Override
    public Set<Coordinate> match(Set<Coordinate> coords, TileMatrix board) throws Exception {
        Set<Coordinate> matched = new HashSet<>();
        // iterate through tmlList
        for(TileMatchingLogic tml : tmlList)
        {
            matched.addAll(tml.match(coords, board));
        }
        return matched;
    }
}
