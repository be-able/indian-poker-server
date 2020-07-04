package com.beable.poker.game.controller;

import com.beable.poker.game.entity.bet.Bet;
import com.beable.poker.game.entity.round.Round;
import com.beable.poker.game.repository.BetRepository;
import com.beable.poker.game.repository.RoundRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("v1/game/{game_id}/round/{round_number}")
public class BetController {
    @Autowired
    BetController(BetRepository betRepository, RoundRepository roundRepository) {
        this.betRepository = betRepository;
        this.roundRepository = roundRepository;
    }

    private BetRepository betRepository;
    private RoundRepository roundRepository;

    @PostMapping("/bet")
    public ResponseEntity<Bet> bet(@PathVariable("game_id") final long gameId,
                                   @PathVariable("round_number") final int roundNumber,
                                   @RequestBody Bet bet) {
        Round round = roundRepository.findByGameIdAndRoundNumber(gameId, roundNumber).orElseThrow();
        round.getBetList().add(bet);
        betRepository.save(bet);
        roundRepository.save(round);

        return ResponseEntity.ok(bet);
    }
}
