package com.xworkz.supermarket;

import com.xworkz.supermarket.dao.SuperMarketDao;
import com.xworkz.supermarket.dto.SuperMarketDto;

public class SuperMarketRunner {

    public static void main(String[] args) {
        SuperMarketDto dto = new SuperMarketDto();
        dto.supermarketId = 101;
        dto.name = "GreenMart";
        dto.location = "Downtown";
        dto.ownerName = "Alice Johnson";
        dto.numberOfEmployees = 50;
        dto.totalSales = 1234567.89;
        dto.contactNumber = "123-456-7890";
        dto.openingHours = "8 AM - 10 PM";

        SuperMarketDao dao = new SuperMarketDao();
        dao.createSuperMarket(dto);
        dao.getSuperMarket();
    }
}


