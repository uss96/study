package com.java.main;

import com.java.employee.Employee;
import com.java.employeeBank.EmployeeBank;

public class main {

    public static void main(String[] args) {
        EmployeeBank parkBank = new EmployeeBank("박찬호");
        parkBank.saveMoney(100);

        EmployeeBank leeBank = new EmployeeBank("이승엽");
        leeBank.saveMoney(300);

        leeBank.getBankInfo();

        parkBank.spendMoney(400);

        leeBank.getBankInfo();
    }
}
