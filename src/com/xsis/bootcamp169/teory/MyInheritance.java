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
class EmployeeX{
    String name;
    String email;
}

class ManagerX extends EmployeeX{
}

class DirectorX extends ManagerX{
}

//key dari inhiritance adalah 'IS'
public class MyInheritance {
    public static void main(String[] args) {
        EmployeeX emp = new EmployeeX();
        emp.name="rusdan";
        DirectorX dir = new DirectorX();
        dir.name = "dini";
        //polymorphism
//        EmployeeX manager = new ManagerX();
//        manager.name = "dono";
        
    }
}
