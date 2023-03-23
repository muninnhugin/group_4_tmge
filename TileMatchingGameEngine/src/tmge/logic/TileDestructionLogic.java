package tmge.logic;
import tmge.Coordinate;
import tmge.TileMatrix;
import java.util.Set;

public interface TileDestructionLogic {
 
    public void destroy(Set<Coordinate> matched, TileMatrix board) throws Exception;
}
