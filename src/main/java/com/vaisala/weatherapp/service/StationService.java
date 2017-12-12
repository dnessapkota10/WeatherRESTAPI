/**
 * 
 */
package com.vaisala.weatherapp.service;

import java.util.List;

import com.vaisala.weatherapp.model.Station;

/**
 * @author Dinesh Sapkota
 *
 */
public interface StationService {

	public void add(Station station);
	public void edit(Station station);
	public void delete(int stationId);
	public Station get(int stationId);
	public List<Station> getAll();
	
}
