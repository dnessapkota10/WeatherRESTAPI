package com.vaisala.weatherapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaisala.weatherapp.model.Observation;
import com.vaisala.weatherapp.service.ObservationService;

/**
 * @author Dinesh Sapkota
 *
 */

@RestController
public class ObservationRestController {

	@Autowired
	ObservationService observationService;

	// Add Observation
	@RequestMapping(value = "/addObservation/", method = RequestMethod.POST)
	public String addStation(@Valid @RequestBody Observation observation) {

		observationService.add(observation);
		return "success";

	}
	
	// Get Observation by Id
	@RequestMapping(value = "/getObservationById/{sensroId}", method = RequestMethod.GET)
	public Observation getObservationById(@PathVariable int observationId) {

		return observationService.get(observationId);

	}

	// Get all Observation
	@RequestMapping(value = "/getObservations/", method = RequestMethod.GET)
	public List<Observation> getBacklog() {

		return observationService.getAll();

	}

	// Get all Observation by Station
	@RequestMapping(value = "/getObservationsbyStation/", method = RequestMethod.GET)
	public List<Observation> getObservationByStation(int stationId) {

		return observationService.getAllByStation(stationId);

	}
	
	// Get all Observation by Sensor
	@RequestMapping(value = "/getObservationsbySensor/", method = RequestMethod.GET)
	public List<Observation> getObservationBySensor(int sensorId) {

		return observationService.getAllBySensor(sensorId);

	}

	// Update Observation by id
	@RequestMapping(value = "/updateObservationById/{observationId}", method = RequestMethod.PUT)
	public String updateObservation(@PathVariable int observationId) {

		observationService.edit(observationService.get(observationId));
		return "success";

	}

	// Remove Observation by id
	@RequestMapping(value = "/removeObservationById/{observationId}", method = RequestMethod.DELETE)
	public String removeObservation(@PathVariable int observationId) {

		observationService.delete(observationId);

		return "success";
	}
}
