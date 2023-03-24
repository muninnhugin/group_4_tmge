package tmge;

import java.util.*;

public class PlayerManager {
    private List<Player> playerList = null;

    public List<Player> getPlayerList() {
        return playerList;
    }

    public Player makePlayer() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter username: ");
        String un = in.nextLine().strip();
        while (un.isEmpty()) {
            System.out.println("Username cannot be empty!");
            System.out.print("Enter username: ");
            un = in.nextLine().strip();
        }
        in.close();
        Player newPlayer = new Player(un);
        playerList.add(newPlayer);
        return newPlayer;
    }
}
