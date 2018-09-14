/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.teory;

/**
 *
 * @author arrizaqu
 */
class EmployeeX{ //super class
    //properties
    private String name;
    private String email;
    private double salary=2000;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    //getter
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    
    
    //setter
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

class ManagerX extends EmployeeX{ //subclass

    @Override
    public double getSalary() {
        return super.getSalary() * 2; //To change body of generated methods, choose Tools | Templates.
    }
    
}

class DirectorX extends ManagerX{

    public DirectorX() {
        super();
    }

    
    @Override
    public double getSalary() {
        return super.getSalary() * 2; //To change body of generated methods, choose Tools | Templates.
    }
    
}

//key dari inhiritance adalah 'IS'
public class MyInheritance {
    public static void main(String[] args) {
        EmployeeX emp = new EmployeeX();
        //polymorphism
        EmployeeX mng = new ManagerX();
        DirectorX dir = new DirectorX();
        
        emp.setName("dono");
        System.out.println("name : "+ emp.getName() + ", salary : "+ emp.getSalary());
        //manager
        mng.setName("dini");
        System.out.println("name : "+ mng.getName() + ", salary : "+ mng.getSalary());
        
        //dir
        dir.setName("denis");
        System.out.println("name : "+ dir.getName() + ", salary : "+ dir.getSalary());
    }
}
