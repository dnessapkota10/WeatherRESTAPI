package com.vaisala.weatherapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaisala.weatherapp.model.Station;
import com.vaisala.weatherapp.service.StationService;

/**
 * @author Dinesh Sapkota
 *
 */

@RestController
public class StationRestController {

	@Autowired
	StationService stationService;

	// Add Station
	@RequestMapping(value = "/addStation/", method = RequestMethod.POST)
	public String addStation(@Valid @RequestBody Station station) {

		stationService.add(station);
		return "success";

	}

	// Get Station by Id
	@RequestMapping(value = "/getStationById/{stationId}", method = RequestMethod.GET)
	public Station getStationById(@PathVariable int stationId) {

		return stationService.get(stationId);

	}

	// Get all Station
	@RequestMapping(value = "/getStations/", method = RequestMethod.GET)
	public List<Station> getStations() {

		return stationService.getAll();

	}

	// Update station by id
	@RequestMapping(value = "/updateStationById/{stationId}", method = RequestMethod.PUT)
	public String updateStation(@PathVariable int stationId) {

		stationService.edit(stationService.get(stationId));
		return "success";

	}

	// Remove station by id
	@RequestMapping(value = "/removeStationById/{stationId}", method = RequestMethod.DELETE)
	public String removeStation(@PathVariable int stationId) {

		stationService.delete(stationId);

		return "success";
	}
}
