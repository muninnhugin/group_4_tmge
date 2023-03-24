package t3;

import tmge.*;
import tmge.logic.EndLogic;

public class EmptyEnd implements EndLogic{
    @Override
    public void check(TMGE tmge) throws Exception {
        if (tmge.checkEnd()) {
            tmge.getMatrix().print();
            System.out.println("Player " + (tmge.getPlayer() + 1) + " wins!");
        }
    }
    
}
