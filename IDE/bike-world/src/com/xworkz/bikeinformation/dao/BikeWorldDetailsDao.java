package com.xworkz.bikeinformation.dao;

import com.xworkz.bikeinformation.dto.BikeWorldDetailsDto;

public class BikeWorldDetailsDao {

    BikeWorldDetailsDto dto;

    public boolean createBike(BikeWorldDetailsDto dto) {
        System.out.println("Create Method Started");
        boolean isBikeCreated = false;

        if (dto != null) {
            this.dto = dto;
            isBikeCreated = true;
        } else {
            System.out.println("Please enter proper details");
        }
        System.out.println("Create Method Ended");
        return isBikeCreated;
    }

    public void getBikeDetails() {
        System.out.println("Bike ID: " + dto.bikeId);
        System.out.println("Bike Name: " + dto.bikeName);
        System.out.println("Manufacturer: " + dto.manufacturer);
        System.out.println("Price: " + dto.price);
        System.out.println("Bike Type: " + dto.bikeType);
    }

}
