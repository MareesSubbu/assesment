package com.allianz.assesment.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class SensorValueResponse {

	public int getCo2level() {
		return co2level;
	}

	public void setCo2level(int co2level) {
		this.co2level = co2level;
	}

	private int co2level;
}
