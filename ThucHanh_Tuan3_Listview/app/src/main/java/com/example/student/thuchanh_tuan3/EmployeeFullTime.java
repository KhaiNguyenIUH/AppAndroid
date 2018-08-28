package com.example.student.thuchanh_tuan3;

/**
 * Created by Student on 8/28/2018.
 */

public class EmployeeFullTime extends Employee {

    @Override
    public double TinhLuong() {
        return 500;
    }
    @Override
    public String toString(){
        return super.toString()+ " FullTime= "+TinhLuong();
    }
}
