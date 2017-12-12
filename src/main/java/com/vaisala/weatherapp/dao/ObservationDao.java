/**
 * 
 */
package com.vaisala.weatherapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaisala.weatherapp.model.Observation;
import com.vaisala.weatherapp.model.Sensor;

/**
 * @author Dinesh Sapkota
 *
 */
@Repository
public interface ObservationDao extends JpaRepository<Observation,Integer>{
	
	public List<Observation> findBySensor(Sensor sensor);
	
}
