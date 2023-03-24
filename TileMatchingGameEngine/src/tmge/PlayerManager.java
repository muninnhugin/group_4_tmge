package tmge;

import java.util.*;

public class PlayerManager {
    private ArrayList<Player> playerList = new ArrayList<>();
    private TMGE tmge;
    private Scanner in;

    PlayerManager(TMGE tmge, Scanner in) {
        this.tmge = tmge;
        this.in = in;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public Player makePlayer() {
        System.out.print("Enter username: ");
        String un = in.nextLine().strip();
        while (un.isEmpty()) {
            System.out.println("Username cannot be empty!");
            System.out.print("Enter username: ");
            un = in.nextLine().strip();
        }
        Player newPlayer = new Player(un);
        playerList.add(newPlayer);
        return newPlayer;
    }
}
