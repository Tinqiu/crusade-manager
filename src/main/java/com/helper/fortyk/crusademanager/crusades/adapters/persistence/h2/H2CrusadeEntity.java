package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.CrusadeId;
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
class H2CrusadeEntity {

    @EmbeddedId
    private H2CrusadeIdEntity id;

    private String username;

    @OneToMany(mappedBy = "crusade")
    List<H2CrusadeForceEntity> h2CrusadeForces;

    Crusade toCrusade() {
        var crusadeForces = h2CrusadeForces.stream()
                .map(H2CrusadeForceEntity::toCrusadeForce)
                .collect(Collectors.toList());

        return new Crusade(CrusadeId.of(id.getValue()),
                username,
                crusadeForces);
    }
}
