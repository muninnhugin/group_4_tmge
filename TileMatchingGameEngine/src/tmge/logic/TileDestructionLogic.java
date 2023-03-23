package tmge.logic;
import tmge.*;
import java.util.Set;

public interface TileDestructionLogic {
 
    public void destroy(Set<Coordinate> matched, TMGE tmge) throws Exception;
}
