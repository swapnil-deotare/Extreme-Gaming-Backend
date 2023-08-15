package com.EG.extremegaming.player;

import java.util.ArrayList;
import java.util.List;

public class PlayersList {
    private static List<Player> playersList = new ArrayList();

    public void addPlayer(Player player) {
        playersList.add(player);
    }
}
