
package tmge.logic;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import tmge.Coordinate;
import tmge.TileMatrix;


public class NeighborMatching implements TileMatchingLogic{
    
    @Override
    public Set<Coordinate> match(Set<Coordinate> coords, TileMatrix matrix) throws Exception {
       
     

        Set<Coordinate> matched = new HashSet<Coordinate>(); 
        Set<Coordinate> visited = new HashSet<Coordinate>(); 
        Queue<Coordinate> explore = new LinkedList<>();

        
       for(Coordinate coordinate : coords)
       {   
        
            Coordinate cur = new Coordinate(coordinate.x, coordinate.y);
         
            explore.add(cur);

            while(!explore.isEmpty()) {       
              
                Boolean match = false;
                cur = explore.remove();

                if (!matrix.checkRange(cur))
                {
                    break;
                }

                if (!visited.contains(cur))
                {
                    visited.add(cur);
                }

                if(matrix.checkXRange(cur.x+1) && matrix.checkYRange(cur.y) && (!visited.contains(new Coordinate(cur.x+1, cur.y))) 
                && (!explore.contains(new Coordinate(cur.x+1, cur.y))) 
                && matrix.getTile(cur).equals(matrix.getTile(new Coordinate(cur.x+1, cur.y))))
                {
                   
                    match = true;
                    explore.add(new Coordinate(cur.x+1, cur.y));
                    matched.add(new Coordinate(cur.x+1, cur.y));
                }
    
                if(matrix.checkXRange(cur.x) && matrix.checkYRange(cur.y-1) 
                && (!visited.contains(new Coordinate(cur.x, cur.y-1)))  
                && (!explore.contains(new Coordinate(cur.x, cur.y-1))) 
                && matrix.getTile(cur).equals(matrix.getTile(new Coordinate(cur.x, cur.y-1))))
                {
          
                    match = true;
                    explore.add(new Coordinate(cur.x, cur.y-1));
                    matched.add(new Coordinate(cur.x, cur.y-1));
                }
    
                if(matrix.checkXRange(cur.x-1) && matrix.checkYRange(cur.y) 
                && (!visited.contains(new Coordinate(cur.x-1, cur.y)))  
                && (!explore.contains(new Coordinate(cur.x-1, cur.y))) 
                && matrix.getTile(cur).equals(matrix.getTile(new Coordinate(cur.x-1, cur.y))))
                {
    
                    match = true;
                    explore.add(new Coordinate(cur.x-1, cur.y));
                    matched.add(new Coordinate(cur.x-1, cur.y));

                }
    
                if(matrix.checkXRange(cur.x) && matrix.checkYRange(cur.y+1) 
                && (!explore.contains(new Coordinate(cur.x, cur.y+1)))
                && (!visited.contains(new Coordinate(cur.x, cur.y+1))) 
                && matrix.getTile(cur).equals(matrix.getTile(new Coordinate(cur.x, cur.y+1))))
                {
                    match = true;
                    explore.add(new Coordinate(cur.x, cur.y+1));
                    matched.add(new Coordinate(cur.x, cur.y+1));
                }
    
                if (match == true)
                {
                    matched.add(coordinate);
                }    
           }
       }
        return matched;
    }
}
