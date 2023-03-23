package t3;

import tmge.*;
import tmge.logic.*;
import java.util.*;

public class T3Destruction implements TileDestructionLogic{
    @Override
    public void destroy(Set<Coordinate> coords, TMGE tmge) throws Exception {
        if (!coords.isEmpty()) tmge.setEnd(true);
    }
}
