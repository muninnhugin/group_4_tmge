package tmge.logic;

import java.util.HashSet;
import java.util.Set;

import tmge.Coordinate;
import tmge.TileMatrix;

public class HorizontalMatching implements TileMatchingLogic{

    @Override
    public Set<Coordinate> match(Coordinate coord, TileMatrix matrix) throws Exception {
        Set<Coordinate> matched = new HashSet<Coordinate>();
        Coordinate cur = new Coordinate(coord.x, coord.y);
        // while this tile is in border and is same
        while(matrix.checkXRange(cur.x) && matrix.isSameColor(matrix.getTile(coord), matrix.getTile(cur)))
        {
            // add coord into matched
            matched.add(new Coordinate(cur));
            cur.y += 1;
        }

        cur = new Coordinate(coord.x, coord.y);
        while(matrix.checkXRange(cur.x) && matrix.isSameColor(matrix.getTile(coord), matrix.getTile(cur)))
        {
            matched.add(new Coordinate(cur));
            cur.y -= 1;
        }

        return matched;
    }

}
