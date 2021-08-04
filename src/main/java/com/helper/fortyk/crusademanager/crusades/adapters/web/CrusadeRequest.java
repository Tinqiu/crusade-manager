package com.helper.fortyk.crusademanager.crusades.adapters.web;

import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model.CrusadeForce;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
class CrusadeRequest {
    private final CrusadeForce crusadeForce1;
    private final CrusadeForce crusadeForce2;
}
