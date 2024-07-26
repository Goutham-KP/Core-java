package com.xworkz.bar.dao;

import com.xworkz.bar.dto.BarDto;

public class BarDao {

    BarDto dto;

    public boolean createBarDetails(BarDto dto){

        System.out.println("create Bar started");
        boolean isBarCreated=false;

        if(null!=dto){
            this.dto=dto;
            isBarCreated=true;

        }
        else  System.out.println("Please enter Correct Details");

        System.out.println("Create bar Ended");
        return isBarCreated;

    }

    public void getBarDetails() {

        System.out.println("Fetching Bar Details");

        System.out.println("The Bar id: "+dto.barId);
        System.out.println("The Bar Name: "+dto.barName);
        System.out.println("The Bar owner: "+dto.ownerName);
        System.out.println("The No of Bar owned by Bar Owner: "+dto.barNumber);
        System.out.println("the No of brand availabel in This Bar: "+dto.noOfBrands);

    }
}
