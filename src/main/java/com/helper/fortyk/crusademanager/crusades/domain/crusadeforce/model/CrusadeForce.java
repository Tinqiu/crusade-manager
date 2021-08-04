package com.helper.fortyk.crusademanager.crusades.domain.crusadeforce.model;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CrusadeForce {

    private final Faction faction;
    private final List<CrusadeCard> crusadeCards;
}
