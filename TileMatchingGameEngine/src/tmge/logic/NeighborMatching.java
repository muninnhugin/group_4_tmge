package tmge.logic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NeighborMatching implements TileMatchingLogic{
    NeighborMatching(ArrayList<TileMatchingLogic> tmlList)
    {

    }

    @Override
    public void match(Coordinate selected) {
        // use BFS to match tiles
        // use tmlList to find neighbors, add it to queue, pop queue
        // gonna use Comparable interface to compare the tiles

        // algo
        // make a queue
        Queue<Coordinate> toMatch = new LinkedList<>();
        // add coordinate to the queue
        toMatch.add(selected);
        // start a loop
        while(!toMatch.isEmpty()) {
            // pop from queue
            Coordinate coordinate = toMatch.remove();
            // process the popped element
                // implements setEmpty() for VisibleTile class
            // add neighbors to queue using tile comparable interface and tml list
        }
    }
}
