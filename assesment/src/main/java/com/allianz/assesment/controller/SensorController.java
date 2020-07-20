package com.allianz.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allianz.assesment.entity.SensorEntity;
import com.allianz.assesment.repo.SensorRepository;

@RestController
@RequestMapping("/svc/v1")
public class SensorController {

	@Autowired
	SensorRepository sensorRepo;
	
	@PostMapping("/co2/sensor")
	public void saveSensor(@RequestBody SensorEntity entity) {
		sensorRepo.save(entity);
	}
}
