package com.vaisala.weatherapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaisala.weatherapp.model.Sensor;
import com.vaisala.weatherapp.service.SensorService;

/**
 * @author Dinesh Sapkota
 *
 */

@RestController
public class SensorRestController {

	@Autowired
	SensorService sensorService;

	// Add Sensor
	@RequestMapping(value = "/addSensor/", method = RequestMethod.POST)
	public String addStation(@Valid @RequestBody Sensor sensor) {

		sensorService.add(sensor);
		return "success";

	}
	
	// Get Sensor by Id
	@RequestMapping(value = "/getSensorById/{sensroId}", method = RequestMethod.GET)
	public Sensor getSensorById(@PathVariable int sensorId) {

		return sensorService.get(sensorId);

	}

	// Get all Sensor
	@RequestMapping(value = "/getSensors/", method = RequestMethod.GET)
	public List<Sensor> getSensors() {

		return sensorService.getAll();

	}

	// Get all Sensor by Station
	@RequestMapping(value = "/getSensorsbyStation/", method = RequestMethod.GET)
	public List<Sensor> getBacklog(int stationId) {

		return sensorService.getAllByStation(stationId);

	}

	// Update Sensor by id
	@RequestMapping(value = "/updateSensorById/{sensorId}", method = RequestMethod.PUT)
	public String updateSensor(@PathVariable int sensorId) {

		sensorService.edit(sensorService.get(sensorId));
		return "success";

	}

	// Remove Sensor by id
	@RequestMapping(value = "/removeSensorById/{sensorId}", method = RequestMethod.DELETE)
	public String removeSensor(@PathVariable int sensorId) {

		sensorService.delete(sensorId);

		return "success";
	}
}
