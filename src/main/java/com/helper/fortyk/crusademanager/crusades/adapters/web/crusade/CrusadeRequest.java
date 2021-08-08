package com.helper.fortyk.crusademanager.crusades.adapters.web.crusade;

import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForce;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
class CrusadeRequest {
    private final CrusadeForce crusadeForce;
}
