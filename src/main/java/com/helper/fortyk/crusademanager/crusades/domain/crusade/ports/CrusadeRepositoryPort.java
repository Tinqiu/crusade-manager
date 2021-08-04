package com.helper.fortyk.crusademanager.crusades.domain.crusade.ports;

import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.CrusadeId;
import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForce;

/**
 * Represents the outbound Persistence port of the {@link Crusade} domain entity.
 */
public interface CrusadeRepositoryPort {
    Crusade getById(CrusadeId id);

    CrusadeId create(CrusadeForce crusadeForce1,
                     CrusadeForce crusadeForce2,
                     CrusadeForce... crusadeForces);
}
