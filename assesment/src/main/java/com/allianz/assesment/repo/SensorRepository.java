package com.allianz.assesment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allianz.assesment.entity.SensorEntity;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Repository
public interface SensorRepository extends JpaRepository<SensorEntity, Long> {
	
	public List<SensorEntity> findByDistrictId(Integer districtId);

}
