package com.helper.fortyk.crusademanager.crusades.adapters.persistence.h2;

import org.springframework.data.jpa.repository.JpaRepository;

interface H2JpaCrusadeRepository extends JpaRepository<H2CrusadeEntity, H2CrusadeIdEntity> {
}
