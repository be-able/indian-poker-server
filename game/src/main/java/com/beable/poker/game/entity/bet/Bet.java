package com.beable.poker.game.entity.bet;

import com.beable.poker.game.entity.BaseEntity;
import com.beable.poker.game.entity.player.Player;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@SuperBuilder
public class Bet extends BaseEntity {
    @OneToOne
    private Player player;
    @Column
    private int chipNumber;

    public Bet() {
        super();
    }
}
