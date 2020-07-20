package com.allianz.assesment.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DistrictResponse {

	
	private String districtName;
	private String emailId;
	@XmlElement
	private List<SensorValueResponse> sensorValue;
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<SensorValueResponse> getSensorValue() {
		return sensorValue;
	}
	public void setSensorValue(List<SensorValueResponse> sensorValue) {
		this.sensorValue = sensorValue;
	}
	
	
	
}
