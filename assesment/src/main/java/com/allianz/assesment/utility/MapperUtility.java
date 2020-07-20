package com.allianz.assesment.utility;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.allianz.assesment.entity.SensorDataEntity;
import com.allianz.assesment.model.SensorDataDTO;


/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Component
public class MapperUtility {

	@Autowired
	ModelMapper mapper;
	/**
	 * @param sensorDataDTO
	 * @return
	 */
	public SensorDataEntity convertToSensorData(SensorDataDTO sensorDataDTO) {
		SensorDataEntity sensor =  mapper.map(sensorDataDTO, SensorDataEntity.class);
		return sensor;
		
	}
}
