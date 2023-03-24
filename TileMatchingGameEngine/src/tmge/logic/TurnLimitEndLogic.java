package tmge.logic;

import tmge.TMGE;

public class TurnLimitEndLogic implements EndLogic{
    @Override
    public void check(TMGE tmge) throws Exception {
        if (tmge.getTurn() > 4) {
            System.out.println("\n     Game over!");
            System.out.println("Player " + (tmge.getPlayer() + 1) + " score is: "+ tmge.getScore(tmge.getPlayer()));
            if (tmge.getScore(tmge.getPlayer()) >= 15){
                System.out.println("Player " + (tmge.getPlayer() + 1) + " wins!");
            }
            else{
                System.out.println("Player " + (tmge.getPlayer() + 1) + " lose!");
            }
            tmge.setEnd(true);
        }
    }
}
