package com.allianz.assesment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allianz.assesment.entity.SensorDataEntity;
import com.allianz.assesment.model.SensorDataDTO;
import com.allianz.assesment.repo.SensorConcentrationRepository;
import com.allianz.assesment.utility.MapperUtility;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Service
public class SensorService {

	@Autowired
	MapperUtility mapperUtility;

	@Autowired
	SensorConcentrationRepository sensorTransRepo;

	/**
	 * @param sensorDTO
	 */
	public SensorDataEntity saveSensorData(SensorDataDTO sensorDTO) {
		return sensorTransRepo.save(mapperUtility.convertToSensorData(sensorDTO));
	}
}
