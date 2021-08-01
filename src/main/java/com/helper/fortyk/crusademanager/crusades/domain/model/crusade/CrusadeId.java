package com.helper.fortyk.crusademanager.crusades.domain.model.crusade;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CrusadeId {
    private final String value;

    public static CrusadeId of(String crusadeId){
        return new CrusadeId(crusadeId);
    }
}
