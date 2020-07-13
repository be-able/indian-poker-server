package com.beable.poker.game.entity.game;

import com.beable.poker.game.entity.BaseEntity;
import com.beable.poker.game.entity.round.Round;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Game extends BaseEntity {
    @OneToMany
    private List<Round> roundList;
}
