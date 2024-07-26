package com.xworkz.bankaccount.dao;

import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsDao {

    AccountDetailsDto dto;

    public boolean createAccount(AccountDetailsDto dto){
        System.out.println("create Method Started");
        boolean isAccountCreated=false;

        if(null!=dto){
            this.dto=dto;
            isAccountCreated=true;
        }
        else {
            System.out.println("Please Enter proper details");
        }
        System.out.println("Create Method Ended");
        return isAccountCreated;
    }


    public void getAccountDetails() {

        System.out.println("Name: "+dto.name);
        System.out.println("Customer Id: "+dto.customerId);
        System.out.println("Bank Name: "+dto.bankName);
        System.out.println("Branch Name: "+dto.branchName);
        System.out.println("Ifsc Code: "+dto.ifscCode);
        System.out.println("Account No: "+dto.accountNo);
        System.out.println("Address: "+dto.address);
        System.out.println("Account Type: "+dto.accountType);


    }
}
