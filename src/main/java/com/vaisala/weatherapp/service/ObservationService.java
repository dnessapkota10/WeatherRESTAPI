/**
 * 
 */
package com.vaisala.weatherapp.service;

import java.util.List;

import com.vaisala.weatherapp.model.Observation;

/**
 * @author Dinesh Sapkota
 *
 */
public interface ObservationService {

	public void add(Observation observation);
	public void edit(Observation observation);
	public void delete(int observationId);
	public Observation get(int observationId);
	public List<Observation> getAll();
	public List<Observation> getAllByStation(int stationId);
	public List<Observation> getAllBySensor(int sensorId);
}
