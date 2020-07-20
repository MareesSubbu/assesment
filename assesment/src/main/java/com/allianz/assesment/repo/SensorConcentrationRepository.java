package com.allianz.assesment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allianz.assesment.entity.SensorDataEntity;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Repository
public interface SensorConcentrationRepository extends JpaRepository<SensorDataEntity, Long>{
	
	List<SensorDataEntity> findBySensorId(String sensorId);
	List<SensorDataEntity> findByDistrictName(String district);

}
