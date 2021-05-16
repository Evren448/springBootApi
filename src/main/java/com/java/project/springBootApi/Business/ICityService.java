package com.java.project.springBootApi.Business;

import java.util.List;

import com.java.project.springBootApi.Entities.City;

public interface ICityService {
	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	
}
