package com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.factions;

public class Imperium extends Faction{
    private static final FactionType FACTION = FactionType.IMPERIUM;

    Imperium(){
        super(FACTION);
    }

    @Override
    public boolean canWorkWith(Faction faction) {
        return FACTION.equals(faction.getType());
    }
}
