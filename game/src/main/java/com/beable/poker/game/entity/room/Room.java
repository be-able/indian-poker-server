package com.beable.poker.game.entity.room;

import com.beable.poker.game.entity.BaseEntity;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@SuperBuilder
@Getter
public class Room extends BaseEntity {
}
