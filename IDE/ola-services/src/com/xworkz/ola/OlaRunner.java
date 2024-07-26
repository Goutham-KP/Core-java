package com.xworkz.ola;

import com.xworkz.ola.dao.OlaServiceDetailsDao;
import com.xworkz.ola.dto.OlaServiceDetailsDto;

public class OlaRunner {

    public static void main(String[] args) {
        OlaServiceDetailsDto dto = new OlaServiceDetailsDto();
        dto.serviceId = 1;
        dto.driverName = "Ravi Kumar";
        dto.carModel = "Hyundai i20";
        dto.licensePlate = "KA-01-AB-1234";
        dto.serviceArea = "Bangalore";
        dto.farePerKm = 12.5;
        dto.contactNumber = "9876543210";
        dto.serviceType = "Prime Sedan";

        OlaServiceDetailsDao dao = new OlaServiceDetailsDao();
        dao.createService(dto);
        dao.getServiceDetails();
    }
}

