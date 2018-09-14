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
public class MyOverloading {
    
    //method 1
    public void info(){
    }
    
    //overload jumlah parameter
    public void info(String username){
    }
    //overload
    public void info(String username, int age){
    }
    //overload
    public void info(int age){
    }
    
    public static void main(String[] args) {
        MyOverloading over = new MyOverloading();
        over.info();
    }
 
}
