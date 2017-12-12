/**
 * 
 */
package com.vaisala.weatherapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaisala.weatherapp.dao.ObservationDao;
import com.vaisala.weatherapp.model.Observation;
import com.vaisala.weatherapp.model.Sensor;

/**
 * @author Dinesh Sapkota
 *
 */
@Service
public class ObservationServiceImpl implements ObservationService{

	@Autowired
	ObservationDao observationDao;
	
	@Autowired
	SensorService sensorService;
	
	@Autowired
	StationService stationService;
	
	@Override
	public void add(Observation observation) {
		// TODO Auto-generated method stub
		observationDao.save(observation);
	}

	@Override
	public void edit(Observation observation) {
		// TODO Auto-generated method stub
		observationDao.save(observation);
	}

	@Override
	public void delete(int observationId) {
		// TODO Auto-generated method stub
		observationDao.delete(observationId);
	}

	@Override
	public Observation get(int observationId) {
		// TODO Auto-generated method stub
		return observationDao.findOne(observationId);
	}

	@Override
	public List<Observation> getAll() {
		// TODO Auto-generated method stub
		return observationDao.findAll();
	}

	@Override
	public List<Observation> getAllByStation(int stationId) {
		// TODO Auto-generated method stub
		List<Observation> observList = new ArrayList<Observation>();
		
		for(Sensor sensor: sensorService.getAllByStation(stationId)){
			observList.addAll(observationDao.findBySensor(sensor));
		}
		
		return observList;
		//return observationDao.findByStation(stationService.get(stationId));
	}

	@Override
	public List<Observation> getAllBySensor(int sensorId) {
		// TODO Auto-generated method stub
		return observationDao.findBySensor(sensorService.get(sensorId));
	}

	
}
