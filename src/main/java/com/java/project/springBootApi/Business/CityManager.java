package com.java.project.springBootApi.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.project.springBootApi.DataAccess.ICityDal;
import com.java.project.springBootApi.Entities.City;

@Service
public class CityManager implements ICityService {

	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	public List<City> getAll() {
		return this.cityDal.getAll();
	}

	@Override
	public void add(City city) {
		this.cityDal.add(city);		
	}

	@Override
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	public void delete(City city) {
		this.cityDal.delete(city);		
	}

}
