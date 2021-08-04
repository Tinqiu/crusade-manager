package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusadeforce;

import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeCard;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "CrusadeCard")
public class H2CrusadeCardEntity {

    @Id
    private int id;

    @ManyToOne(optional = false)
    @JoinColumn(name = H2CrusadeForceEntity.CRUSADE_CARD_JOIN_COL, nullable = false)
    private H2CrusadeForceEntity crusadeForce;

    public CrusadeCard toCrusadeCard(){
        return new CrusadeCard();
    }
}
