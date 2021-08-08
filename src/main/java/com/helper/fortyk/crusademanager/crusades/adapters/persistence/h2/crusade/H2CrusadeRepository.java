package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2.crusade;

import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.CrusadeId;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.ports.CrusadeRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * H2 implementation of the {@link CrusadeRepositoryPort} interface.
 */
@Repository
@RequiredArgsConstructor
class H2CrusadeRepository implements CrusadeRepositoryPort {
    private final H2JpaCrusadeRepository jpaCrusadeRepository;

    @Override
    public Optional<Crusade> getById(CrusadeId id) {
        var maybeCrusade = jpaCrusadeRepository.findById(H2CrusadeIdEntity.of(id));
        return maybeCrusade.map(H2CrusadeEntity::toCrusade);
    }

    @Override
    public CrusadeId create(Crusade crusade) {
        var h2Crusade = H2CrusadeEntity.of(crusade);
        return jpaCrusadeRepository.save(h2Crusade).toCrusade().getId();
    }
}
