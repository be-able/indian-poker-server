package com.beable.poker.game.controller;

import com.beable.poker.game.entity.game.Game;
import com.beable.poker.game.repository.GameRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("v1/game")
public class GameController {
    @Autowired
    GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    private GameRepository gameRepository;

    @PostMapping
    public ResponseEntity<Game> create() {
        Game game = gameRepository.save(new Game());
        return ResponseEntity.ok(game);
    }
}
