package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.CrusadeId;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Embeddable
@AllArgsConstructor(access = AccessLevel.PROTECTED)
class H2CrusadeIdEntity implements Serializable {
    private String value;

    public H2CrusadeIdEntity() {
        this.value = UUID.randomUUID().toString();
    }

    public static H2CrusadeIdEntity of(CrusadeId crusadeId) {
        return new H2CrusadeIdEntity(crusadeId.getValue());
    }
}
