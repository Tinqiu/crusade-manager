package com.helper.fortyk.crusademanager.crusades.adapters.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("crusades")
@RequiredArgsConstructor
class CrusadeController {
    private final CrusadeWebService crusadeWebService;

    @GetMapping("{crusadeId}")
    public CrusadeResponse get(@PathVariable("crusadeId") String id) {
        return crusadeWebService.get(id);
    }

    @PostMapping
    public CrusadeIdResponse create(CrusadeRequest crusadeRequest) {
        return crusadeWebService.create(crusadeRequest);
    }
}
