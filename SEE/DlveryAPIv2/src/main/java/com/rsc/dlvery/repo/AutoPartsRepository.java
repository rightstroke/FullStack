package com.rsc.dlvery.repo;

import com.rsc.dlvery.entity.AutoParts;
import com.rsc.dlvery.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoPartsRepository extends JpaRepository<AutoParts,Long> {
    
}
