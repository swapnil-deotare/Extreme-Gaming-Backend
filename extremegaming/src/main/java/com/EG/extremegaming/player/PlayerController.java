package com.EG.extremegaming.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @GetMapping("/player")
    public String getPlayer() {
        return "Player has been found";
    }
}
