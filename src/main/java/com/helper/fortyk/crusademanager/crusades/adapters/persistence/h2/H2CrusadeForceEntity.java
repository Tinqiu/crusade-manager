package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusadeforce.CrusadeForce;

import javax.persistence.*;

@Entity(name = "CrusadeForce")
class H2CrusadeForceEntity {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private H2CrusadeEntity crusade;

    CrusadeForce toCrusadeForce() {
        return new CrusadeForce();
    }
}
