package com.beable.poker.game.entity.gameStatus;

import com.beable.poker.game.entity.BaseEntity;
import com.beable.poker.game.entity.player.Player;
import com.beable.poker.game.entity.round.Round;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@SuperBuilder
public class GameStatus extends BaseEntity {
    @OneToOne
    private Round round;
    @Column
    private GameState gameState;
    @OneToOne
    private Player firstPlayer;
    @OneToOne
    private Player secondPlayer;
    @OneToOne
    private Player turnPlayer;
}
