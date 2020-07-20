package com.allianz.assesment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Entity
@Table(name = "concentration_data")

//@NamedQuery(name = " SensorConcentrationEntity.findByDistrictName" , query="SELECT s FROM SensorConcentrationEntity s"
//																			+ "	 WHERE c.name = :name")

public class SensorDataEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "concentration_id")
	private Long transactionId;

	@Column(name = "sensor_id")
	private String sensorId;

	@Column(name = "co2_level")
	private Integer sensorValue;

	@Column(name = "district_name")
	private String districtName;

	@Column(name = "data_reading_time")
	private Date readingDateAndTime;

	
	public Integer getSensorValue() {
		return sensorValue;
	}

	public void setSensorValue(Integer sensorValue) {
		this.sensorValue = sensorValue;
	}

	@ManyToOne(optional = false)
	@JoinColumn(name = "sensor_id", referencedColumnName = "id", insertable = false, updatable = false)
	private SensorEntity sensorEntity;

	public SensorEntity getSensorEntity() {
		return sensorEntity;
	}

	public void setSensorEntity(SensorEntity sensorEntity) {
		this.sensorEntity = sensorEntity;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Date getReadingDateAndTime() {
		return readingDateAndTime;
	}

	public void setReadingDateAndTime(Date readingDateAndTime) {
		this.readingDateAndTime = readingDateAndTime;
	}

}
