package com.bridge.parallel_stream;

import java.util.ArrayList;
import  java.util.List;

import java.util.Random;

public class EmployeeDatabase {


    public static List <Employee> getEmployee(){

        List <Employee> employees = new ArrayList<>();
        for(int i=1;i<=1000;i++){
            employees.add(new Employee(i,"employee"+i,Double.valueOf(new Random().nextInt(1000*100)),"A"));

        }
        return  employees;
    }
}
