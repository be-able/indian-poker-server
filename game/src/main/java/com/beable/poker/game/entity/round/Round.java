package com.beable.poker.game.entity.round;

import com.beable.poker.game.entity.BaseEntity;
import com.beable.poker.game.entity.bet.Bet;
import com.beable.poker.game.entity.game.Game;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@SuperBuilder
@Getter
public class Round extends BaseEntity {
    @ManyToOne
    private Game game;
    @Column
    private int roundNumber;
    @OneToMany
    private List<Bet> betList;
}
