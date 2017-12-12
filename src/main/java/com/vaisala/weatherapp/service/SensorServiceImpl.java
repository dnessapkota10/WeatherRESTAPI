/**
 * 
 */
package com.vaisala.weatherapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaisala.weatherapp.dao.SensorDao;
import com.vaisala.weatherapp.model.Sensor;

/**
 * @author Dinesh Sapkota
 *
 */
@Service
public class SensorServiceImpl implements SensorService{

	@Autowired 
	SensorDao sensorDao;
	
	@Autowired
	StationService stationService;
	
	@Override
	public void add(Sensor sensor) {
		// TODO Auto-generated method stub
		sensorDao.save(sensor);
	}

	@Override
	public void edit(Sensor sensor) {
		// TODO Auto-generated method stub
		sensorDao.save(sensor);
	}

	@Override
	public void delete(int sensorId) {
		// TODO Auto-generated method stub
		sensorDao.delete(sensorId);
	}

	@Override
	public Sensor get(int sensorId) {
		// TODO Auto-generated method stub
		return sensorDao.findOne(sensorId);
	}

	@Override
	public List<Sensor> getAll() {
		// TODO Auto-generated method stub
		return sensorDao.findAll();
	}

	@Override
	public List<Sensor> getAllByStation(int stationId) {
		// TODO Auto-generated method stub
		return sensorDao.findByStation(stationService.get(stationId));
	}

}
