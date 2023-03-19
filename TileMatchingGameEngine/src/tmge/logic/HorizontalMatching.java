package tmge.logic;

import java.util.HashSet;
import java.util.Set;

import tmge.Coordinate;
import tmge.TileMatrix;

public class HorizontalMatching implements TileMatchingLogic{

    @Override
    public Set<Coordinate> match(Set<Coordinate> coords, TileMatrix matrix) throws Exception {
        Set<Coordinate> matched = new HashSet<Coordinate>();
        for(Coordinate coordinate : coords)
        {
            Coordinate cur = new Coordinate(coordinate.x, coordinate.y);
            // while this tile is in border and is same
            while(matrix.checkYRange(cur.y))
            {
                if(matrix.isSameColor(matrix.getTile(coordinate), matrix.getTile(cur)))
                // add coord into matched
                    matched.add(new Coordinate(cur));
                cur.y += 1;
            }

            cur = new Coordinate(coordinate.x, coordinate.y);
            while(matrix.checkYRange(cur.y) && matrix.isSameColor(matrix.getTile(coordinate), matrix.getTile(cur)))
            {
                if(matrix.isSameColor(matrix.getTile(coordinate), matrix.getTile(cur)))
                    matched.add(new Coordinate(cur));
                cur.y -= 1;
            }
        }

        return matched;
    }

}
