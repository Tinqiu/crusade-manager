package com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.factions;

import lombok.Getter;
import org.hibernate.cfg.NotYetImplementedException;

public abstract class Faction {
    @Getter
    private final FactionType type;

    protected Faction(FactionType factionType) {
        this.type = factionType;
    }

    public abstract boolean canWorkWith(Faction faction);

    public static Faction ofType(FactionType type) {
        switch (type) {
            case IMPERIUM:
                return new Imperium();
            case ORKS:
            case CHAOS:
            case AELDARI:
            case NECRONS:
            case TYRANIDS:
            case TAU_EMPIRE:
            default:
                throw new NotYetImplementedException("Faction not yet supported");
        }
    }
}
