package com.xworkz.supermarket.dao;

import com.xworkz.supermarket.dto.SuperMarketDto;

public class SuperMarketDao {

    SuperMarketDto dto;

    public boolean createSuperMarket(SuperMarketDto dto) {
        System.out.println("Create Method Started");
        boolean isSupermarketCreated = false;

        if (dto != null) {
            this.dto = dto;
            isSupermarketCreated = true;
        } else {
            System.out.println("Please enter proper details");
        }
        System.out.println("Create Method Ended");
        return isSupermarketCreated;
    }

    public void getSuperMarket() {
        System.out.println("Supermarket ID: " + dto.supermarketId);
        System.out.println("Name: " + dto.name);
        System.out.println("Location: " + dto.location);
        System.out.println("Owner Name: " + dto.ownerName);
        System.out.println("Number of Employees: " + dto.numberOfEmployees);
        System.out.println("Total Sales: " + dto.totalSales);
        System.out.println("Contact Number: " + dto.contactNumber);
        System.out.println("Opening Hours: " + dto.openingHours);
    }


}
