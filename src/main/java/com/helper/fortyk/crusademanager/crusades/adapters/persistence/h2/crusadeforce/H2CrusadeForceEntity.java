package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusadeforce;

import com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusade.H2CrusadeEntity;
import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForce;
import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.factions.FactionType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "CrusadeForce")
public class H2CrusadeForceEntity {
    public static final String CRUSADE_CARD_JOIN_COL = "crusade_cards";
    @Id
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private FactionType faction;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private H2CrusadeEntity crusade;

    @OneToMany(mappedBy = "crusadeForce")
    @Column(name = CRUSADE_CARD_JOIN_COL)
    private List<H2CrusadeCardEntity> crusadeCards = new ArrayList<>();

    public CrusadeForce toCrusadeForce() {
        var cards = crusadeCards.stream()
                .map(H2CrusadeCardEntity::toCrusadeCard)
                .collect(Collectors.toList());
        return CrusadeForce.of(faction, cards);
    }

    public static H2CrusadeForceEntity of(CrusadeForce crusadeForce) {
       var h2Cards = crusadeForce.getCrusadeCards().stream()
                .map(H2CrusadeCardEntity::fromCrusadeCard)
                .collect(Collectors.toList());
       var factionType = crusadeForce.getFaction().getType();
        return new H2CrusadeForceEntity();
    }
}
