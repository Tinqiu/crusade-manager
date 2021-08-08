package com.helper.fortyk.crusademanager.crusades.domain.crusade.ports;

import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.CrusadeId;

import java.util.Optional;

/**
 * Represents the outbound Persistence port of the {@link Crusade} domain entity.
 */
public interface CrusadeRepositoryPort {
    Optional<Crusade> getById(CrusadeId id);

    CrusadeId create(Crusade crusade);
}
