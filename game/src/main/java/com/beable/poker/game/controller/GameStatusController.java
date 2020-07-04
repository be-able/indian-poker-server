package com.beable.poker.game.controller;

import com.beable.poker.game.entity.gameStatus.GameStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/v1/game/{game_id}/game-status")
public class GameStatusController {
    @GetMapping
    public ResponseEntity<GameStatus> getById(@PathVariable("game_id") final long gameId) {
        return ResponseEntity.ok(GameStatus.builder().id(1L).createdDate(LocalDateTime.now()).updatedDate(LocalDateTime.now()).build());
    }
}
