package com.beable.poker.game.entity.game;

import com.beable.poker.game.entity.BaseEntity;
import com.beable.poker.game.entity.round.Round;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@SuperBuilder
@NoArgsConstructor
public class Game extends BaseEntity {
    @OneToMany
    private List<Round> roundList = new ArrayList<>();
}
