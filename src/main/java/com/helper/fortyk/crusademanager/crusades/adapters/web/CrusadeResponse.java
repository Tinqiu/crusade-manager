package com.helper.fortyk.crusademanager.crusades.adapters.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForce;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class CrusadeResponse {
    @JsonProperty
    private final String id;

    @JsonProperty
    private final String username;

    @JsonProperty
    private final List<CrusadeForce> crusadeForces;

    public static CrusadeResponse of(Crusade crusade) {
        return new CrusadeResponse(crusade.getId().getValue(),
                crusade.getUsername(),
                crusade.getCrusadeForces());
    }
}
