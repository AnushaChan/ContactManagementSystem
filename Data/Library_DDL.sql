DROP DATABASE IF EXISTS LIBRARY;
-- Create the Database "LIBRARY"
CREATE DATABASE LIBRARY;


-- Set the currently active database to be "LIBRARY"
USE LIBRARY;

DROP TABLE IF EXISTS CONTACT;
CREATE TABLE CONTACT (
  contact_id INT NOT NULL,
  First_name         VARCHAR(25) NOT NULL,
  Middle_name         VARCHAR(25) NOT NULL,
  Last_name         VARCHAR(25) NOT NULL,	
  CONSTRAINT pk_Contact PRIMARY KEY (contact_id)
);


DROP TABLE IF EXISTS ADDRESS;
CREATE TABLE ADDRESS (
  Address_id INT NOT NULL AUTO_INCREMENT,
  contact_id INT NOT NULL,
  Address_type         VARCHAR(25) NOT NULL,
  Address         VARCHAR(100),
  City         VARCHAR(25), 	
  State         VARCHAR(25),
  Zip         VARCHAR(25),
  CONSTRAINT pk_Address PRIMARY KEY (address_id)
);


DROP TABLE IF EXISTS PHONE;
CREATE TABLE PHONE (
  Phone_id INT NOT NULL AUTO_INCREMENT,
  contact_id INT NOT NULL,
  Phone_type         VARCHAR(25) NOT NULL,
  Area_code         VARCHAR(25),
  Number         INT,
  CONSTRAINT pk_Address PRIMARY KEY (phone_id)
);

DROP TABLE IF EXISTS DATE;
CREATE TABLE DATE (
  Date_id INT NOT NULL AUTO_INCREMENT,
  contact_id INT NOT NULL,
  Date_type         VARCHAR(25) NOT NULL,
  Date DATE,
  CONSTRAINT pk_Address PRIMARY KEY (date_id)
);

