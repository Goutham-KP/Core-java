package com.xworkx.passportapplication;

import com.xworkx.passportapplication.dao.PassportDao;
import com.xworkx.passportapplication.dto.PassportDto;

public class PassportRunner {

    public static void main(String[] arg){

        PassportDto dto=new PassportDto();
        dto.cpvLoc= "PO";
        dto.dcdrLoc=2;
        dto.name="Furry";
        dto.nickName="Tejas";
        dto.birthDate="31-07-1999";
        dto.mailId="tejasmailme@gmail.com";
        dto.isLoginEmailSame=true;
        dto.id="21";
        dto.pwd="Itachi@2";
        dto.cpwd="Itachi@2";
        dto.ques="what is ur fav Anime";
        dto.ans="Bleach";
        dto.captchaa="EDF321";



        PassportDao dao=new PassportDao();
        dao.createPassportUserDetails(dto);

        dao.getPassportDetails();
    }

}
