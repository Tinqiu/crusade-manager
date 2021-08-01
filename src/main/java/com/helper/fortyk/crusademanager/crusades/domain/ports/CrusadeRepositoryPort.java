package com.helper.fortyk.crusademanager.crusades.domain.ports;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.CrusadeId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Framework handled {@link JpaRepository}.
 * <p>
 * Represents the outbound Persistence port of the {@link Crusade} domain entity.
 */

public interface CrusadeRepositoryPort {
    Crusade getById(CrusadeId id);

    CrusadeId create(String username);
}
