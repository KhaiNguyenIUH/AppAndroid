package com.example.student.thuchanh_tuan3;

/**
 * Created by Student on 8/28/2018.
 */

public class EmployeeParttime extends Employee {
    @Override
    public double TinhLuong()
    {
        return  150;
    }
    @Override
    public String toString()
    {
        return super.toString()+ " Parttime= "+TinhLuong();
    }
}
