package com.beable.poker.game.repository;

import com.beable.poker.game.entity.round.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoundRepository extends JpaRepository<Round, Long> {
    Optional<Round> findByGameIdAndRoundNumber(Long gameId, int roundNumber);
}
