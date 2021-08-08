package com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model;

import lombok.Getter;

import java.util.UUID;

public class CrusadeForceId {
    @Getter
    private final String value;

    public CrusadeForceId(String forceId){
        validateUuidFormat(forceId);
        this.value = forceId;
    }

    private static void validateUuidFormat(String forceId) {
        try {
            UUID.fromString(forceId);
        } catch (IllegalArgumentException e) {
            var msg = String.format("Force Id %s is not a valid Id", forceId);
            throw new IllegalArgumentException(msg, e);
        }
    }
}
