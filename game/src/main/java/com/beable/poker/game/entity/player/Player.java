package com.beable.poker.game.entity.player;

import com.beable.poker.game.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@SuperBuilder
public class Player extends BaseEntity {
    @Column
    private int chips;
}
