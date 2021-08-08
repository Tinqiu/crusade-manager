package com.helper.fortyk.crusademanager.crusades.adapters.web.crusadeforce;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CrusadeForceController {
    private final CrusadeForceWebService crusadeForceWebService;
}
