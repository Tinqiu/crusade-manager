package com.helper.fortyk.crusademanager.crusades.domain.crusade.ports;

import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.CrusadeId;
import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForce;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrusadeService {
    private final CrusadeRepositoryPort crusadeRepository;

    public Crusade get(CrusadeId crusadeId) {
        return crusadeRepository.getById(crusadeId);
    }

    public CrusadeId create(CrusadeForce crusadeForce){
        var newCrusade = Crusade.create(crusadeForce);
        return crusadeRepository.create(newCrusade);
    }
}
