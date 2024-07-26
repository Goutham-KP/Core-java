package com.xworkz.bankaccount;

import com.xworkz.bankaccount.dao.AccountDetailsDao;
import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsRunner {
    public static void main(String[] args) {


        AccountDetailsDto dto = new AccountDetailsDto();
        dto.customerId = 21;
        dto.name = "Gagan";
        dto.bankName = "Canara";
        dto.branchName = "RajajiNagar";
        dto.ifscCode = "RJN3241";
        dto.accountNo = 2345667654l;
        dto.address = "Sukundkate";
        dto.accountType = "Savings";

        AccountDetailsDao dao = new AccountDetailsDao();

        dao.createAccount(dto);

        dao.getAccountDetails();
    }
}
