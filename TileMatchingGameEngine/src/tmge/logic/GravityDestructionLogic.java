package tmge.logic;
import tmge.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1. go through the matrix and if its part of matched set, set to empty 
//2. if there's an empty spot, move all pieces down by one cell (if smth above)
                            // move all pieces to the side by one cell  (if nothing above/if smth next to)

public class GravityDestructionLogic extends DestructionLogic {
    private boolean respawn;
    private boolean updateScore;

    public GravityDestructionLogic(boolean respawn)
    {
        this.respawn = respawn;
        this.updateScore = true;
    }

    public GravityDestructionLogic(boolean respawn, boolean updateScore)
    {
        this.respawn = respawn;
        this.updateScore = updateScore;
    }


    @Override
    public void destroy(Set<Coordinate> matched, TMGE tmge) throws Exception {
        TileMatrix tm = tmge.getMatrix();
        super.removeMatch(tm, matched);

        if(updateScore) tmge.setCurrentScore(tmge.getCurrentScore() + matched.size());

        // make a set of cols of which is there matched tiles
        Set<Integer> cols = new HashSet<>();
        for(Coordinate coordinate : matched)
        {
            cols.add(coordinate.y);
        }

        // sort col by empty and visible using insertion sort
        for(int col : cols)
        {
            for(int i = 1; i < tm.getRow(); ++i)
            {
                int j = i;
                while(j > 0 && tm.getTile(new Coordinate(j, col)).isEmpty())
                {
                    tm.swapTiles(new Coordinate(j, col), new Coordinate(j - 1, col));
                    --j;
                }
            }
        }

        if(respawn) respawn(tm);
    }

    public void respawn(TileMatrix tm) throws Exception {
        Random rn = new Random();
        int n = VisibleTile.COLORS.length - 1;
        for (int i = 0; i < tm.getRow(); ++i)
            for (int j = 0; j < tm.getColumn(); ++j) {
                Coordinate coordinate = new Coordinate(i, j);
                if (tm.getTile(coordinate).isEmpty())
                    tm.setTile(coordinate, new VisibleTile(VisibleTile.COLORS[rn.nextInt(n)], new Circle()));
            }
    }
}
