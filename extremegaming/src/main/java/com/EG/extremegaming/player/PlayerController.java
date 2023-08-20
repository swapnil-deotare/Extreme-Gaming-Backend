package com.EG.extremegaming.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/player/{id}")
    public Player getPlayer(@PathVariable("id") String playerId) {
        return playerRepository.getPlayerById(playerId);
    }

    @PostMapping("/player")
    public Player savePlayer(@RequestBody Player player) {
        return playerRepository.save(player);
    }

    @DeleteMapping("/player/{id}")
    public String deletePlayer(@PathVariable("id") String playerId) {
        return playerRepository.deletePlayer(playerId);
    }

    @PutMapping("/player/{id}")
    public String updatePlayer(@PathVariable("id") String playerId, @RequestBody Player player) {
        return playerRepository.updatePlayer(playerId, player);
    }

}
