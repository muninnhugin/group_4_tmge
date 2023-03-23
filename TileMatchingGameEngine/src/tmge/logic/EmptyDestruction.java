package tmge.logic;
import java.util.Set;
import tmge.*;

public class EmptyDestruction extends DestructionLogic {
    @Override
    public void destroy(Set<Coordinate> coords, TileMatrix board) throws Exception {
        return;
    }
}
