package com.bridge.parallel_stream;
import java.util.List;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class parallelStreamExample {


    public static void main(String[] args) {
        long start=0;
        long end=0;
//        start= System.currentTimeMillis();
//
//        IntStream.range(1,100).forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("total time taken: "+(end-start));
//
//System.out.println("=============>");
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("total time taken: "+(end-start));
//

//        IntStream.range(1,10).forEach(x->{
//            System.out.println("Thread Name**"+Thread.currentThread().getName()+": "+x);
//        });
//
//        IntStream.range(1,10).parallel().forEach(x->{
//            System.out.println("threda name"+ Thread.currentThread().getName()+": "+x);
//        });


        List<Employee> employeeList = EmployeeDatabase.getEmployee();
                start= System.currentTimeMillis();
        double SalaryWithSteam  = employeeList.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("Normal stream : "+(end-start)+"average salary: "+SalaryWithSteam);


        start= System.currentTimeMillis();
        double SalaryWithparallelSteam  = employeeList.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("parallel stream : "+(end-start)+"average salaray: "+SalaryWithparallelSteam);

    }


}
