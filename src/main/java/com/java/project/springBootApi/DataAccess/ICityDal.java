package com.java.project.springBootApi.DataAccess;

import java.util.List;

import com.java.project.springBootApi.Entities.*;

public interface ICityDal {
	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	
}
