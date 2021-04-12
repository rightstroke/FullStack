package com.rsc.dlvery.repo;

import java.util.List;

import com.rsc.dlvery.entity.AutoParts;
import com.rsc.dlvery.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoPartsRepository extends JpaRepository<AutoParts,Long> {
    @Query("select a from AutoParts a where a.autoId=:autoid")
    public List<AutoParts> getAutoPartsByid(int autoid);

    @Query("select a from WindShield a where a.autoId=:autoid")
    public List<AutoParts> getAutoPartsByid2(int autoid);
}
