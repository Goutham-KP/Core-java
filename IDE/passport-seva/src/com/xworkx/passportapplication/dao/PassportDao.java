package com.xworkx.passportapplication.dao;

import com.xworkx.passportapplication.dto.PassportDto;

public class PassportDao {

    PassportDto dto;




    public boolean createPassportUserDetails(PassportDto dto){

        System.out.println("Create Method Started");

        boolean isPassportCreate=false;

        if(null!=dto){
            this.dto=dto;
            isPassportCreate=true;
        }
        else{
            System.out.println("please Provide proper Details");
        }
        System.out.println("Create Method Ended");
        return isPassportCreate;
    }


    public  void getPassportDetails() {

        System.out.println("Fetching the details");

        System.out.println("The Cpv Location: "+dto.cpvLoc);
        System.out.println("The Dcdr Location: "+dto.dcdrLoc);
        System.out.println("The Name is: "+dto.name);
        System.out.println("The Nick Name is: "+dto.nickName);
        System.out.println("The Date od Birth is: "+dto.birthDate);
        System.out.println("The Emai Id: "+dto.mailId);
        System.out.println("Is Email Login Id Same: "+dto.isLoginEmailSame);
        System.out.println("The Id: "+dto.id);
        System.out.println("the Password: "+dto.pwd);
        System.out.println("The Confirm Password: "+dto.cpwd);
        System.out.println("The Hint Question: "+dto.ques);
        System.out.println("The Answer: "+dto.ans);
        System.out.println("The Captcha is: "+dto.captchaa);



    }
    
    


}
