package com.xworkz.swiggyapplication;

import com.xworkz.swiggyapplication.dao.SwiggyDao;
import com.xworkz.swiggyapplication.dto.SwiggyDto;

public class SwiggyRunner {

    public static void main(String[] args) {
        SwiggyDto dto=new SwiggyDto();
        dto.foodId=234;
        dto.foodName="Masal Dose";
        dto.deliveryLocation="Yelahanka";
        dto.quantity=2;
        dto.price=100.00;

        SwiggyDao dao=new SwiggyDao();
        dao.orderFood(dto);

        dao.getFood();
    }
}
