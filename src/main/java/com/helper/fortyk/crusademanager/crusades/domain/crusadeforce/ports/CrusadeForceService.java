package com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.ports;

import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForce;
import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.factions.FactionType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class CrusadeForceService {
    private final CrusadeForceRepositoryPort crusadeForceRepository;

    public CrusadeForce get(String id){
        return CrusadeForce.of(FactionType.IMPERIUM, Collections.emptyList());
    }
}
