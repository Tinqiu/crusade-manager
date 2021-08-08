package com.helper.fortyk.crusademanager.crusades.adapters.web.crusade;

import com.helper.fortyk.crusademanager.crusades.domain.crusade.model.CrusadeId;
import com.helper.fortyk.crusademanager.crusades.domain.crusade.ports.CrusadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class CrusadeWebService {
    private final CrusadeService crusadeService;

    public CrusadeResponse get(String crusadeId) {
        var crusade = crusadeService.get(CrusadeId.of(crusadeId));
        return CrusadeResponse.of(crusade);
    }

    public CrusadeIdResponse create(CrusadeRequest crusadeRequest) {
        var crusadeId = crusadeService.create(crusadeRequest.getCrusadeForce());
        return CrusadeIdResponse.of(crusadeId);
    }
}
