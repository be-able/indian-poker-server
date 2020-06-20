package com.beable.poker.game.repository;

import com.beable.poker.game.entity.bet.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepository extends JpaRepository<Bet, Long> {
}
