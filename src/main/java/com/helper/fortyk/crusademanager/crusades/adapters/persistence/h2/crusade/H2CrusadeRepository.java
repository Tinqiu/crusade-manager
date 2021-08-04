package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusade;

import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.CrusadeId;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.ports.CrusadeRepositoryPort;
import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForce;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Collections;

/**
 * H2 implementation of the {@link CrusadeRepositoryPort} interface.
 */
@Repository
@RequiredArgsConstructor
class H2CrusadeRepository implements CrusadeRepositoryPort {
    private final H2JpaCrusadeRepository jpaCrusadeRepository;

    @Override
    public Crusade getById(CrusadeId id) {
        return jpaCrusadeRepository.getById(H2CrusadeIdEntity.of(id)).toCrusade();
    }

    @Override
    public CrusadeId create(CrusadeForce crusadeForce1,
                            CrusadeForce crusadeForce2,
                            CrusadeForce... crusadeForces) {
        var h2Crusade = new H2CrusadeEntity(new H2CrusadeIdEntity(),
                Collections.emptyList());
        return jpaCrusadeRepository.save(h2Crusade).toCrusade().getId();
    }
}
