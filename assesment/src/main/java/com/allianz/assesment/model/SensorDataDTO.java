package com.allianz.assesment.model;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Component
public class SensorDataDTO {

	@Size(max = 20, message = "{Min.sensorId}")
	private String sensorId;

	@Size(max = 100, message = "{Size.districtName}")
	private String districtName;

	private Integer sensorValue;
	
	public Integer getSensorValue() {
		return sensorValue;
	}

	public void setSensorValue(Integer sensorValue) {
		this.sensorValue = sensorValue;
	}

	private Date readingDateAndTime;

	

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}

	public Date getReadingDateAndTime() {
		return readingDateAndTime;
	}

	public void setReadingDateAndTime(Date readingDateAndTime) {
		this.readingDateAndTime = readingDateAndTime;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	
	
}
