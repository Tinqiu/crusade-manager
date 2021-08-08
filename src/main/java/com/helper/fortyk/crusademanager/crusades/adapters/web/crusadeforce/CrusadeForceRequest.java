package com.helper.fortyk.crusademanager.crusades.adapters.web.crusadeforce;

import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.factions.FactionType;
import lombok.Getter;

import java.util.Locale;

public class CrusadeForceRequest {
    @Getter
    private final FactionType factionType;

    public CrusadeForceRequest(String factionType) {
        this.factionType = FactionType.valueOf(factionType.toUpperCase(Locale.ROOT));
    }
}
