package com.helper.fortyk.crusademanager.crusades.adapters.web.crusadeforce;

import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForceId;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class CrusadeForceIdResponse {
    @Getter
    private final String value;

    public static CrusadeForceIdResponse of(CrusadeForceId forceId) {
        return new CrusadeForceIdResponse(forceId.getValue());
    }


}
