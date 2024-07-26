package com.xworkz.bikeinformation;

import com.xworkz.bikeinformation.dao.BikeWorldDetailsDao;
import com.xworkz.bikeinformation.dto.BikeWorldDetailsDto;

public class BikeInformationRunner {

    public static void main(String[] args) {
        BikeWorldDetailsDto dto1 = new BikeWorldDetailsDto();
        dto1.bikeId = 101;
        dto1.bikeName = "Xpulse";
        dto1.manufacturer = "Hero";
        dto1.price = 1200.50;
        dto1.bikeType = "Adventure";


        BikeWorldDetailsDao dao = new BikeWorldDetailsDao();

        dao.createBike(dto1);
        dao.getBikeDetails();

    }


}
