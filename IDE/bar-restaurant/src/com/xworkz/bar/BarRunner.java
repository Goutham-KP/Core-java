package com.xworkz.bar;

import com.xworkz.bar.dao.BarDao;
import com.xworkz.bar.dto.BarDto;

public class BarRunner {

    public static void main(String[] args) {

        BarDto dto=new BarDto();
        dto.barId=243;
        dto.barName="RCB Wines";
        dto.ownerName="Mr Nags";
        dto.noOfBrands=345;
        dto.barNumber=3;

        BarDao dao=new BarDao();

        dao.createBarDetails(dto);

        dao.getBarDetails();

    }

}
