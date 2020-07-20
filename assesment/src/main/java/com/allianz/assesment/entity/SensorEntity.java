package com.allianz.assesment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Entity
@Table(name = "sensor_info")

public class SensorEntity {

	@Id
	private String id;

	@Column(name = "district_id", nullable = false)
	private Integer districtId;

	/*@ManyToOne(optional = false)
	@JoinColumn(name = "district_id", referencedColumnName = "id", insertable = false, updatable = false)
	private DistrictEntity district;
*/
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/*public DistrictEntity getDistrict() {
		return district;
	}

	public void setDistrict(DistrictEntity district) {
		this.district = district;
	}
*/
	
	/*public DistrictEntity getDistrictEntity() {
		return district;
	}

	public void setDistrictEntity(DistrictEntity districtEntity) {
		this.district = districtEntity;
	}*/

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	/*
	 * @OneToMany(mappedBy = "sensorEntity",cascade=CascadeType.ALL,fetch =
	 * FetchType.EAGER) private List<SensorTransactionEntity> sensorReadingData;
	 * 
	 * 
	 * public List<SensorTransactionEntity> getSensorReadingData() { return
	 * sensorReadingData; }
	 * 
	 * public void setSensorReadingData(List<SensorTransactionEntity>
	 * sensorReadingData) { this.sensorReadingData = sensorReadingData; }
	 */

}
