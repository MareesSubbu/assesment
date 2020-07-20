package com.allianz.assesment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allianz.assesment.entity.DistrictEntity;

/**
 * @author Mareeswaran Sreenivasan
 *
 */
@Repository
public interface DistrictRepository extends JpaRepository<DistrictEntity, Long>{
	

}
