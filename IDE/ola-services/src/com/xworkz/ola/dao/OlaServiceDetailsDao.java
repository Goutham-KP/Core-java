package com.xworkz.ola.dao;

import com.xworkz.ola.dto.OlaServiceDetailsDto;

public class OlaServiceDetailsDao {

    OlaServiceDetailsDto dto;

    public boolean createService(OlaServiceDetailsDto dto) {
        System.out.println("Create Method Started");
        boolean isServiceCreated = false;

        if (dto != null) {
            this.dto = dto;
            isServiceCreated = true;
        } else {
            System.out.println("Please enter proper details");
        }
        System.out.println("Create Method Ended");
        return isServiceCreated;
    }

    public void getServiceDetails() {
        System.out.println("Service ID: " + dto.serviceId);
        System.out.println("Driver Name: " + dto.driverName);
        System.out.println("Car Model: " + dto.carModel);
        System.out.println("License Plate: " + dto.licensePlate);
        System.out.println("Service Area: " + dto.serviceArea);
        System.out.println("Fare Per Km: " + dto.farePerKm);
        System.out.println("Contact Number: " + dto.contactNumber);
        System.out.println("Service Type: " + dto.serviceType);
    }


}
