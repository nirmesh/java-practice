package com.bridge.parallel_stream;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String grade;


    public Employee(){

    }

    public Employee(int id,String name,double salary, String grade){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.grade=grade;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getGrade() {
        return grade;
    }
}





