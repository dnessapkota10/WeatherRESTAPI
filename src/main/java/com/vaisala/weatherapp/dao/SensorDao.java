/**
 * 
 */
package com.vaisala.weatherapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaisala.weatherapp.model.Sensor;
import com.vaisala.weatherapp.model.Station;

/**
 * @author Dinesh Sapkota
 *
 */
@Repository
public interface SensorDao extends JpaRepository<Sensor,Integer>{

	public List<Sensor> findByStation(Station station);
}
