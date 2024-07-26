package com.xworkz.atm;

import com.xworkz.atm.dao.AtmDao;
import com.xworkz.atm.dto.AtmDto;

public class AtmRunner {
    public static void main(String[] args) {
        AtmDto dto = new AtmDto();
        dto.id = 2;
        dto.brand="Rupay";
        dto.bankName="canara";
        dto.location="Yelahanka";

        AtmDao dao=new AtmDao();


        dao.createAtmDetails(dto);

        dao.getAtmDetails();



    }
}
