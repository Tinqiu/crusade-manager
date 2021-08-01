package com.helper.fortyk.crusademanager.crusades.domain.ports;

import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.Crusade;
import com.helper.fortyk.crusademanager.crusades.domain.model.crusade.CrusadeId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrusadeService {
    private final CrusadeRepositoryPort crusadeRepository;

    public Crusade get(CrusadeId crusadeId) {
        return crusadeRepository.getById(crusadeId);
    }

    public CrusadeId create(String username){
        return crusadeRepository.create(username);
    }
}
