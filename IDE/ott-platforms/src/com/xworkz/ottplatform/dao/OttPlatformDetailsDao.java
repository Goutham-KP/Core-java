package com.xworkz.ottplatform.dao;

import com.xworkz.ottplatform.dto.OttPlatformDetailsDto;

public class OttPlatformDetailsDao {

    OttPlatformDetailsDto dto;

    public boolean createPlatform(OttPlatformDetailsDto dto) {
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
        System.out.println("Subscription Cost: " + dto.subscriptionCost);
        System.out.println("Number of Subscribers: " + dto.numberOfSubscribers);
        System.out.println("Contact Support: " + dto.contactSupport);
        System.out.println("Launch Date: " + dto.launchDate);
        System.out.println("Content Type: " + dto.contentType);
    }

}
