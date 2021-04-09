package com.rsc.dlvery.repo;

import java.util.List;

import com.rsc.dlvery.entity.Animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {
    
    @Query("select a from Animal a")
    public List<Animal> getAnimals();
}
