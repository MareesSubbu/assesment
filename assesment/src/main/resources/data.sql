


CREATE TABLE district (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  district_name VARCHAR(250) NOT NULL,
  district_pincode BIGINT,
  office_address VARCHAR(500) NOT NULL,
  mail_id VARCHAR(100) DEFAULT NULL
 
);

CREATE TABLE sensor(
	id VARCHAR(20) PRIMARY KEY NOT NULL,
	district_id INT
	);

CREATE TABLE co2_data(
concentration_id BIGINT PRIMARY KEY NOT NULL,
sensor_id VARCHAR(20) ,
co2_level INT,
data_reading_time DATETIME,
district_name VARCHAR(250) NOT NULL


);

