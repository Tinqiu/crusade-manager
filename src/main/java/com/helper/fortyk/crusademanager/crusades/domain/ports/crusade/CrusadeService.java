package com.helper.fortyk.crusademanager.crusades.domain.ports.crusade;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.CrusadeId;
import com.helper.fortyk.crusademanager.crusades.domain.model.crusadeforce.CrusadeForce;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrusadeService {
    private final CrusadeRepositoryPort crusadeRepository;

    public Crusade get(CrusadeId crusadeId) {
        return crusadeRepository.getById(crusadeId);
    }

    public CrusadeId create(CrusadeForce crusadeForce1,
                            CrusadeForce crusadeForce2,
                            CrusadeForce... crusadeForces){
        return crusadeRepository.create(crusadeForce1,
                crusadeForce2,
                crusadeForces);
    }
}
