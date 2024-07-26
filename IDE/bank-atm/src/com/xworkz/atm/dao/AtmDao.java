package com.xworkz.atm.dao;

import com.xworkz.atm.dto.AtmDto;

public class AtmDao {

    AtmDto dto;

    public boolean createAtmDetails(AtmDto dto){

        System.out.println("Create Method Started");
        boolean isAtmCreated=false;

        if(null!=dto){
            this.dto=dto;
            isAtmCreated=true;
        }
        else
            System.out.println("Please Enter proper Details");

        System.out.println("Create Method Ended");
        return isAtmCreated;
    }


    public void getAtmDetails() {

        System.out.println("fetching Details:...");
        System.out.println("ATM ID: " +dto.id );
        System.out.println("Atm Barnd: "+dto.brand);
        System.out.println("Bank Name: "+dto.bankName);
        System.out.println("Atm Location: "+dto.location);

    }
}
