package com.xworkz.swiggyapplication.dao;

import com.xworkz.swiggyapplication.dto.SwiggyDto;

public class SwiggyDao {

    SwiggyDto dto;

    public boolean orderFood(SwiggyDto dto){
        System.out.println("food Order Started ");
        boolean isFoodordered=false;

        if(null!=dto){
            this.dto=dto;
            isFoodordered=true;
        }
        else   System.out.println("Order proper food");

        System.out.println("food Order Ended");
        return isFoodordered;
    }

    public void getFood() {

        System.out.println("Fetching Food Ordered:...");
        System.out.println("The food Id: "+dto.foodId);
        System.out.println("The Food Name: "+dto.foodName);
        System.out.println("The Delivery Location: "+dto.deliveryLocation);
        System.out.println("The Quantity of Food is: "+dto.quantity);
        System.out.println("The Food price: "+dto.price);

    }
}
