/**
 * 
 */
package com.vaisala.weatherapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaisala.weatherapp.dao.StationDao;
import com.vaisala.weatherapp.model.Station;

/**
 * @author Dinesh Sapkota
 *
 */
@Service
public class StationServiceImpl implements StationService{

	@Autowired
	StationDao stationDao;
	
	@Override
	public void add(Station station) {
		// TODO Auto-generated method stub
		stationDao.save(station);
	}

	@Override
	public void edit(Station station) {
		// TODO Auto-generated method stub
		stationDao.save(station);
	}

	@Override
	public void delete(int stationId) {
		// TODO Auto-generated method stub
		stationDao.delete(stationId);
	}

	@Override
	public Station get(int stationId) {
		// TODO Auto-generated method stub
		return stationDao.findOne(stationId);
	}

	@Override
	public List<Station> getAll() {
		// TODO Auto-generated method stub
		return stationDao.findAll();
	}

}
