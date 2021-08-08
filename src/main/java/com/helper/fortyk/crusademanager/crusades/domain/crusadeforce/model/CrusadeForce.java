package com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model;

import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.factions.Faction;
import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.factions.FactionType;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class CrusadeForce {

    private final String id;
    private final Faction faction;
    private final List<CrusadeCard> crusadeCards = new ArrayList<>();

    private CrusadeForce(FactionType factionType, List<CrusadeCard> crusadeCards) {
        var forceFaction = Faction.ofType(factionType);
        validateCardFaction(forceFaction, crusadeCards);
        this.faction = forceFaction;
        this.crusadeCards.addAll(crusadeCards);
        this.id = UUID.randomUUID().toString();
    }

    private void validateCardFaction(Faction faction, List<CrusadeCard> crusadeCards) {
        crusadeCards.forEach(card -> {
            if (!faction.canWorkWith(card.getFaction()))
                throw new IllegalArgumentException();
        });
    }


    public static CrusadeForce of(FactionType factionType,
                                  List<CrusadeCard> crusadeCards) {
        return new CrusadeForce(factionType, crusadeCards);
    }

    public void addCrusadeCard(CrusadeCard card) {
        if (faction.canWorkWith(card.getFaction())) {
            crusadeCards.add(card);
        } else {
            throw new IllegalArgumentException("faction.cannotWorkWith.messageKey");
        }
    }
}
