package com.helper.fortyk.crusademanager.crusades.adapters.web.crusadeforce;

import com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.ports.CrusadeForceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrusadeForceWebService {
    private final CrusadeForceService crusadeForceService;
}
