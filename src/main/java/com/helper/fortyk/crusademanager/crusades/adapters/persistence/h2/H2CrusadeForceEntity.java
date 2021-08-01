package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.crusadeforce.CrusadeForce;
import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.crusadeforce.CrusadeForcePersistenceEntity;

import javax.persistence.*;

@Entity(name = "CrusadeForce")
class H2CrusadeForceEntity implements CrusadeForcePersistenceEntity {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private H2CrusadeEntity crusade;

    @Override
    public CrusadeForce toCrusadeForce() {
        return new CrusadeForce();
    }
}
