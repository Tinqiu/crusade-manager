package com.helper.fortyk.crusademanager.crusades.domain.crusade.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class CrusadeId {
    private final String value;

    public static CrusadeId create() {
        var id = UUID.randomUUID().toString();
        return new CrusadeId(id);
    }

    public static CrusadeId of(String idValue) {
        validateUuidFormat(idValue);
        return new CrusadeId(idValue);
    }

    private static void validateUuidFormat(String value) {
        try {
            UUID.fromString(value);
        } catch (IllegalArgumentException e) {
            var msg = String.format("%s is not a valid CrusadeId value", value);
            throw new CrusadeIdCreationException(msg, e);
        }
    }

    private static class CrusadeIdCreationException extends RuntimeException {
        public CrusadeIdCreationException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
