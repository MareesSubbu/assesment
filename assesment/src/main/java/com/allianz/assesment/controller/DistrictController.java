package com.allianz.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allianz.assesment.entity.DistrictEntity;
import com.allianz.assesment.model.SensorRecordResponse;
import com.allianz.assesment.repo.DistrictRepository;
import com.allianz.assesment.repo.SensorConcentrationRepository;
import com.allianz.assesment.repo.SensorRepository;

@RestController
@RequestMapping("/svc/v1")
public class DistrictController {

	@Autowired
	DistrictRepository repo;

	@Autowired
	SensorRecordResponse sensorRecordDailyBasis;

	@Autowired
	SensorRepository sensorRepo;

	@Autowired
	SensorConcentrationRepository concentrationRepo;

	@PostMapping("/co2/districts")
	public void saveDisrictData(@RequestBody DistrictEntity entity) {
		repo.save(entity);
	}

}
