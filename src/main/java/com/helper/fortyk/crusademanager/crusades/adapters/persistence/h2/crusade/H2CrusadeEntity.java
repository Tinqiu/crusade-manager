package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusade;

import com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusadeforce.H2CrusadeForceEntity;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.Crusade;
import lombok.AccessLevel;
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
public class H2CrusadeEntity {

    @EmbeddedId
    private H2CrusadeIdEntity id;

    @OneToMany(mappedBy = "crusade")
    List<H2CrusadeForceEntity> h2CrusadeForces;

    private H2CrusadeEntity(List<H2CrusadeForceEntity> h2CrusadeForces) {
        this.id = H2CrusadeIdEntity.create();
        this.h2CrusadeForces = h2CrusadeForces;
    }

    public Crusade toCrusade() {
        var crusadeForces = h2CrusadeForces.stream()
                .map(H2CrusadeForceEntity::toCrusadeForce)
                .collect(Collectors.toList());

        return Crusade.of(id.toCrusadeId(),
                crusadeForces);
    }

    public static H2CrusadeEntity of(Crusade crusade) {
        var crusadeForces = crusade.getCrusadeForces().stream()
                .map(H2CrusadeForceEntity::of)
                .collect(Collectors.toList());
        return new H2CrusadeEntity(crusadeForces);
    }
}

