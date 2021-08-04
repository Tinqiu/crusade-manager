package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusade;

import com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusadeforce.H2CrusadeForceEntity;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.CrusadeId;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "Crusade")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class H2CrusadeEntity {

    @EmbeddedId
    private H2CrusadeIdEntity id;

    @OneToMany(mappedBy = "crusade")
    List<H2CrusadeForceEntity> h2CrusadeForces;

    public Crusade toCrusade() {
        var crusadeForces = h2CrusadeForces.stream()
                .map(H2CrusadeForceEntity::toCrusadeForce)
                .collect(Collectors.toList());

        return Crusade.create(CrusadeId.of(id.getValue()),
                crusadeForces);
    }
}
