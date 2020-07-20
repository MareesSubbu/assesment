
package com.allianz.assesment.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allianz.assesment.entity.SensorDataEntity;
import com.allianz.assesment.model.SensorDataDTO;
import com.allianz.assesment.service.SensorService;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@RestController
@RequestMapping("/svc/v1")
public class SensorReaderController {
	
	@Autowired
	SensorService sensorService;
	
	private static final Logger log = LoggerFactory.getLogger(SensorReaderController.class);

	
	/**
	 * @param sensorDTO
	 */
	@PostMapping("/co2/reader")
	public SensorDataEntity saveSensorData(@Valid @RequestBody SensorDataDTO sensorDTO) {
		log.info("Sensor Reader Request Received");
		SensorDataEntity sensorData= sensorService.saveSensorData(sensorDTO);
		return sensorData;
	}

}
