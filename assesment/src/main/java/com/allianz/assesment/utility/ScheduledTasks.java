package com.allianz.assesment.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.allianz.assesment.entity.DistrictEntity;
import com.allianz.assesment.entity.SensorDataEntity;
import com.allianz.assesment.model.DistrictResponse;
import com.allianz.assesment.model.SensorRecordResponse;
import com.allianz.assesment.model.SensorValueResponse;
import com.allianz.assesment.repo.DistrictRepository;
import com.allianz.assesment.repo.SensorConcentrationRepository;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	/*
	 * @Autowired SensorTransactionRepository repo;
	 */
	@Autowired
	DistrictRepository repo;
	@Autowired
	SensorConcentrationRepository sensorRepo;
	@Autowired
	SensorRecordResponse record;
	 
	
	@Scheduled(cron = "*/10 * * * * *")    // every 10 seconds it is running
	public void generateSensorRecord() {
		log.info("Scheduled Task Running {}", dateFormat.format(new Date()));
		
		try {
			//File.WriteAllText("C:\\Users\\101403\\sensor_report.xml", "");
            File file = new File("C:\\Users\\101403\\sensor_report.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(SensorRecordResponse.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
          //  HashMap<DistrictEntity, SensorData>  mapSensorRecord = new HashMap<>();

            List<DistrictResponse> districtListResponse =new ArrayList<>();
           
            Optional.of(repo.findAll()).ifPresent(districtList->{
            	
			for(DistrictEntity district:districtList) {
				DistrictResponse districtResponse = new DistrictResponse();
				districtResponse.setDistrictName(district.getDistrictName());
				districtResponse.setEmailId(district.getDistrictOfficeEmailId());
				List<SensorDataEntity> sensorList= sensorRepo.findByDistrictName(district.getDistrictName());
				List<SensorValueResponse> sensorResponseList= new ArrayList<>();
				 if(Optional.of(sensorList).isPresent()) {
					 
					 sensorList.stream().forEach(sensor->{
						 SensorValueResponse sensorValueResponse = new SensorValueResponse();
						 sensorValueResponse.setCo2level(sensor.getSensorValue());
						 sensorResponseList.add(sensorValueResponse);
					 });
					 districtResponse.setSensorValue(sensorResponseList);
				 }
				 districtListResponse.add(districtResponse);
			}
			
			
		});
            record.setDistrictResponse(districtListResponse);
            jaxbMarshaller.marshal(record, file);
            /*try {
				record.setSensorRecord(mapSensorRecord);
				
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
            
            //jaxbMarshaller.marshal(user, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
		
		
	}
}