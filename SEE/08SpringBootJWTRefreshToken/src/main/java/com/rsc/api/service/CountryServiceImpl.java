package com.rsc.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsc.api.model.Country;
import com.rsc.api.repo.CountryRepository;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryRepository repo;

	@Override
	public List<Country> getCountries() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
