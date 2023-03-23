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
        Set<Coordinate> temp = new HashSet<Coordinate>();
        for(Coordinate coordinate : coords)
        {
            Coordinate cur = new Coordinate(coordinate.x, coordinate.y);
            temp.clear();
            // while this tile is in border and is same
            while(matrix.checkRange(cur) && matrix.getTile(coordinate).equals(matrix.getTile(cur)))
            {
                // add coord into matched
                temp.add(new Coordinate(cur));
                cur.x += 1;
            }

            cur = new Coordinate(coordinate.x - 1, coordinate.y);
            while(matrix.checkRange(cur) && matrix.getTile(coordinate).equals(matrix.getTile(cur)))
            {
                temp.add(new Coordinate(cur));
                cur.x -= 1;
            }
            if (temp.size() >= minimumToWatch) {
                matched.addAll(temp);
            }
        }
        return matched;
    }

}