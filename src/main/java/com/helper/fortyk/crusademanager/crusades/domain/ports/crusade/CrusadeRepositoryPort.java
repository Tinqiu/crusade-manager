package com.helper.fortyk.crusademanager.crusades.domain.ports.crusade;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.CrusadeId;
import com.helper.fortyk.crusademanager.crusades.domain.model.crusadeforce.CrusadeForce;

/**
 * Represents the outbound Persistence port of the {@link Crusade} domain entity.
 */
public interface CrusadeRepositoryPort {
    Crusade getById(CrusadeId id);

    CrusadeId create(CrusadeForce crusadeForce1,
                     CrusadeForce crusadeForce2,
                     CrusadeForce... crusadeForces);
}
