package com.allianz.assesment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Entity
@Table(name = "district")
public class DistrictEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "district_name")
	private String districtName;

	@Column(name = "district_pincode")
	private Long districtPinCode;

	@Column(name = "office_address")
	private String districtOfficeAddress;

	@Column(name = "mail_id")
	private String districtOfficeEmailId;

	/*@OneToMany(mappedBy = "district", cascade = CascadeType.ALL)
	// @JacksonXmlProperty(localName = "sensor")
	// @JacksonXmlElementWrapper(useWrapping = true)
	private List<SensorEntity> sensor;

	public List<SensorEntity> getSensor() {
		return sensor;
	}

	public void setSensor(List<SensorEntity> sensor) {
		this.sensor = sensor;
	}*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Long getDistrictPinCode() {
		return districtPinCode;
	}

	public void setDistrictPinCode(Long districtPinCode) {
		this.districtPinCode = districtPinCode;
	}

	public String getDistrictOfficeAddress() {
		return districtOfficeAddress;
	}

	public void setDistrictOfficeAddress(String districtOfficeAddress) {
		this.districtOfficeAddress = districtOfficeAddress;
	}

	public String getDistrictOfficeEmailId() {
		return districtOfficeEmailId;
	}

	public void setDistrictOfficeEmailId(String districtOfficeEmailId) {
		this.districtOfficeEmailId = districtOfficeEmailId;
	}

	public DistrictEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistrictEntity(Integer id, String districtName, Long districtPinCode, String districtOfficeAddress,
			String districtOfficeEmailId) {
		super();
		this.id = id;
		this.districtName = districtName;
		this.districtPinCode = districtPinCode;
		this.districtOfficeAddress = districtOfficeAddress;
		this.districtOfficeEmailId = districtOfficeEmailId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districtName == null) ? 0 : districtName.hashCode());
		result = prime * result + ((districtOfficeAddress == null) ? 0 : districtOfficeAddress.hashCode());
		result = prime * result + ((districtOfficeEmailId == null) ? 0 : districtOfficeEmailId.hashCode());
		result = prime * result + ((districtPinCode == null) ? 0 : districtPinCode.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DistrictEntity other = (DistrictEntity) obj;
		if (districtName == null) {
			if (other.districtName != null)
				return false;
		} else if (!districtName.equals(other.districtName))
			return false;
		if (districtOfficeAddress == null) {
			if (other.districtOfficeAddress != null)
				return false;
		} else if (!districtOfficeAddress.equals(other.districtOfficeAddress))
			return false;
		if (districtOfficeEmailId == null) {
			if (other.districtOfficeEmailId != null)
				return false;
		} else if (!districtOfficeEmailId.equals(other.districtOfficeEmailId))
			return false;
		if (districtPinCode == null) {
			if (other.districtPinCode != null)
				return false;
		} else if (!districtPinCode.equals(other.districtPinCode))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
