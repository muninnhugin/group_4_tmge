package tmge.logic;

import java.util.HashSet;
import java.util.Set;

import tmge.Coordinate;
import tmge.TileMatrix;

public class VerticalMatching implements TileMatchingLogic{

    int minimumToWatch;

    public VerticalMatching(int minimumToWatch)
    {
        this.minimumToWatch = minimumToWatch;
    }

    @Override
    public Set<Coordinate> match(Set<Coordinate> coords, TileMatrix matrix) throws Exception {
        Set<Coordinate> matched = new HashSet<Coordinate>();
        for(Coordinate coordinate : coords)
        {
            Coordinate cur = new Coordinate(coordinate.x, coordinate.y);
            // while this tile is in border and is same
            while(matrix.checkXRange(cur.x) && matrix.isSameColor(matrix.getTile(coordinate), matrix.getTile(cur)))
            {
                // add coord into matched
                matched.add(new Coordinate(cur));
                cur.x += 1;
            }

            cur = new Coordinate(coordinate.x, coordinate.y);
            while(matrix.checkXRange(cur.x) && matrix.isSameColor(matrix.getTile(coordinate), matrix.getTile(cur)))
            {
                matched.add(new Coordinate(cur));
                cur.y -= 1;
            }
        }

        if(matched.size() < minimumToWatch)
            return new HashSet<>();

        return matched;
    }

}