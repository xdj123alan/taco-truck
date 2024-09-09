package com.alan.truck.config;

import com.alan.truck.entity.TacoTruckEntity;
import com.alan.truck.repositotry.TacoTruckRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
public class DatabaseConfig {

    @javax.annotation.Resource
    private TacoTruckRepository truckRepository;


    /**
     * read csv file and init h2 data
     * @return
     * @throws IOException
     */
    @PostConstruct
    public void initH2Data() throws IOException {
        Resource resource = new ClassPathResource("./excel/Mobile_Food_Facility_Permit.csv");
        try (InputStreamReader reader = new InputStreamReader(resource.getInputStream(), "UTF-8")) {
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
            List<TacoTruckEntity> records = new ArrayList<>();

            for (CSVRecord csvRecord : csvParser) {
                records.add(convertData(csvRecord.toMap()));
            }
            truckRepository.saveAll(records);
        }

    }

    private TacoTruckEntity convertData(Map<String, String> record){
        TacoTruckEntity entity = new TacoTruckEntity();
        entity.setLocationId(Long.valueOf(record.get("locationid")));
        entity.setApplicant(record.get("Applicant"));
        entity.setFacilityType(record.get("FacilityType"));
        entity.setCnn(record.get("cnn"));
        entity.setLocationDescription(record.get("LocationDescription"));
        entity.setAddress(record.get("Address"));
        entity.setBlockLot(record.get("blocklot"));
        entity.setBlock(record.get("block"));
        entity.setLot(record.get("lot"));
        entity.setPermit(record.get("permit"));
        entity.setStatus(record.get("Status"));
        entity.setFoodItems(record.get("FoodItems"));
        entity.setX(record.get("X"));
        entity.setY(record.get("Y"));
        entity.setLatitude(record.get("Latitude"));
        entity.setLongitude(record.get("Longitude"));
        entity.setSchedule(record.get("Schedule"));
        entity.setDayshours(record.get("dayshours"));
        entity.setNOISent(record.get("NOISent"));
        entity.setApproved(record.get("Approved"));
        entity.setReceived(record.get("Received"));
        entity.setPriorPermit(record.get("PriorPermit"));
        entity.setExpirationDate(record.get("ExpirationDate"));
        entity.setLocation(record.get("Location"));
        entity.setFirePreventionDistricts(record.get("Fire Prevention Districts"));
        entity.setPoliceDistricts(record.get("Police Districts"));
        entity.setSupervisorDistricts(record.get("Supervisor Districts"));
        entity.setZipCodes(record.get("Zip Codes"));
        entity.setNeighborhoodsOld(record.get("Neighborhoods (old)"));
        return entity;
    }
}
