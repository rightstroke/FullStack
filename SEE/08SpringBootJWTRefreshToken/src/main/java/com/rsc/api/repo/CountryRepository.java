package com.rsc.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsc.api.model.Country;
import com.rsc.api.model.DAOUser;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>  {

}
