package com.helper.fortyk.crusademanager.crusades.adapters.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.CrusadeId;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class CrusadeIdResponse {

    @JsonProperty
    public final String value;

    public static CrusadeIdResponse of(CrusadeId crusadeId) {
        return new CrusadeIdResponse(crusadeId.getValue());
    }
}
