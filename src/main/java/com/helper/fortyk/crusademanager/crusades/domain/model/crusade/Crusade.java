package com.helper.fortyk.crusademanager.crusades.domain.model.crusade;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.crusadeforce.CrusadeForce;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Crusade {

    private final CrusadeId id;
    private final String username;
    private final List<CrusadeForce> crusadeForces = new ArrayList<>();

    public Crusade(CrusadeId id, String username, List<CrusadeForce> crusadeForces){
        this.id = id;
        this.username = username;
        this.crusadeForces.addAll(crusadeForces);
    }

    public void addCrusadeForce(CrusadeForce crusadeForce){
        this.crusadeForces.add(crusadeForce);
    }
}
