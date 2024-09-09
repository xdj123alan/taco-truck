package com.alan.truck.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TacoTruckEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long locationId;

    private String applicant;

    private String facilityType;

    private String cnn;

    private String locationDescription;

    private String address;

    private String blockLot;

    private String block;

    private String lot;

    private String permit;

    private String status;

    @Column(name = "foodItems", length = 1024)
    private String foodItems;

    private String x;

    private String y;

    private String latitude;

    private String longitude;

    private String schedule;

    private String dayshours;

    private String NOISent;

    private String approved;

    private String received;

    private String priorPermit;

    private String expirationDate;

    private String location;

    private String firePreventionDistricts;

    private String policeDistricts;

    private String supervisorDistricts;

    private String zipCodes;

    private String neighborhoodsOld;

}
