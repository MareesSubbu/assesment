package com.allianz.assesment.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Component
@XmlRootElement(name="record")
@XmlAccessorType(XmlAccessType.FIELD)
public class SensorRecordResponse {

	
	@XmlElement
	private List<DistrictResponse> districtResponse;

	public List<DistrictResponse> getDistrictResponse() {
		return districtResponse;
	}

	public void setDistrictResponse(List<DistrictResponse> districtResponse) {
		this.districtResponse = districtResponse;
	}

		
}
