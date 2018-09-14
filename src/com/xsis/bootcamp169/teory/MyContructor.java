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
class Employee{
    //empty constructor
    Employee(){
        System.out.println("hallo constructor");
    }
    //parameter consturctor / overloading constructor
    Employee(String username){
        System.out.println("hallo : "+ username);
    }
    public void info(){
        System.out.println("hallo world");
    }
}

public class MyContructor {
    public static void main(String[] args) {
        Employee emp =  new Employee();
        Employee emp2 = new Employee("husni");
       // emp.info();
    }
}
