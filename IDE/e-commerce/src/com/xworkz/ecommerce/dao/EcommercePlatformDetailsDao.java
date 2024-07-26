package com.xworkz.ecommerce.dao;

import com.xworkz.ecommerce.dto.EcommercePlatformDetailsDto;

public class EcommercePlatformDetailsDao {

    EcommercePlatformDetailsDto dto;

    public boolean createPlatform(EcommercePlatformDetailsDto dto) {
        System.out.println("Create Method Started");
        boolean isPlatformCreated = false;

        if (dto != null) {
            this.dto = dto;
            isPlatformCreated = true;
        } else {
            System.out.println("Please enter proper details");
        }
        System.out.println("Create Method Ended");
        return isPlatformCreated;
    }

    public void getPlatformDetails() {
        System.out.println("Platform ID: " + dto.platformId);
        System.out.println("Platform Name: " + dto.platformName);
        System.out.println("Owner Company: " + dto.ownerCompany);
        System.out.println("Annual Revenue: " + dto.annualRevenue);
        System.out.println("Number of Users: " + dto.numberOfUsers);
        System.out.println("Contact Support: " + dto.contactSupport);
        System.out.println("Launch Date: " + dto.launchDate);
        System.out.println("Product Categories: " + dto.productCategories);
    }


}
