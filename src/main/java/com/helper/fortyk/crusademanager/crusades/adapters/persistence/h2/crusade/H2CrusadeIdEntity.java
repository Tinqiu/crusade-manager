package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusade;

import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.CrusadeId;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
class H2CrusadeIdEntity implements Serializable {
    private String value;

    private H2CrusadeIdEntity(String value) {
        this.value = value;
    }

    public static H2CrusadeIdEntity create(){
        return new H2CrusadeIdEntity(UUID.randomUUID().toString());
    }
    public static H2CrusadeIdEntity of(CrusadeId crusadeId) {
        return new H2CrusadeIdEntity(crusadeId.getValue());
    }

    public CrusadeId toCrusadeId() {
        return CrusadeId.of(value);
    }
}
