package com.xworkz.ecommerce;

import com.xworkz.ecommerce.dao.EcommercePlatformDetailsDao;
import com.xworkz.ecommerce.dto.EcommercePlatformDetailsDto;

public class AmazonRunner {

    public static void main(String[] args) {
        EcommercePlatformDetailsDto dto1 = new EcommercePlatformDetailsDto();
        dto1.platformId = 1;
        dto1.platformName = "Amazon";
        dto1.ownerCompany = "EAmzon Inc.";
        dto1.annualRevenue = 5000000.00;
        dto1.numberOfUsers = 1000000;
        dto1.contactSupport = "support@amzzon.com";
        dto1.productCategories = "Electronics, Clothing, Home & Kitchen";

        EcommercePlatformDetailsDao dao = new EcommercePlatformDetailsDao();

        dao.createPlatform(dto1);
        dao.getPlatformDetails();


    }
}
