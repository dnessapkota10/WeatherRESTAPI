/**
 * 
 */
package com.vaisala.weatherapp.service;

import java.util.List;

import com.vaisala.weatherapp.model.Sensor;

/**
 * @author Dinesh Sapkota
 *
 */
public interface SensorService {

	public void add(Sensor sensor);
	public void edit(Sensor sensor);
	public void delete(int sensorId);
	public Sensor get(int sensorId);
	public List<Sensor> getAll();
	public List<Sensor> getAllByStation(int stationId);
	
}
