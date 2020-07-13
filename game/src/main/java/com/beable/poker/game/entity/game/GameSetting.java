package com.beable.poker.game.entity.game;

import com.beable.poker.game.entity.BaseEntity;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@SuperBuilder
public class GameSetting extends BaseEntity {
    @Column
    private int initialChipNumber;
}
