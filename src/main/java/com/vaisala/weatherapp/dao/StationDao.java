/**
 * 
 */
package com.vaisala.weatherapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaisala.weatherapp.model.Station;

/**
 * @author Dinesh Sapkota
 *
 */
@Repository
public interface StationDao extends JpaRepository<Station,Integer>{

}
