package com.helper.fortyk.crusademanager.crusades.domain.model.crusade;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusadeforce.CrusadeForce;

import java.util.ArrayList;
import java.util.List;

public class Crusade {

    private final CrusadeId id;
    private final List<CrusadeForce> crusadeForces = new ArrayList<>();

    private Crusade(CrusadeId id, List<CrusadeForce> crusadeForces) {
        this.id = id;
        this.crusadeForces.addAll(crusadeForces);
    }

    public static Crusade create(CrusadeId id,
                                 List<CrusadeForce> crusadeForces) {
        return new Crusade(id, crusadeForces);
    }
}
