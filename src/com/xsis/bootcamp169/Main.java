/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169;

/**
 *
 * @author arrizaqu
 */
public class Main {
    
    //deklarasi variable // field // property // global variable // attribute
    String name = "agus";
    String address = "jl. taman langsat";
    //primitive variable
    double salary = 5000.0;
    char gender = 'M';
    
    //fungsi / method / procedure / subroutine
    // 1. RETURN
    
    // 2. VOID
    
    //main method
    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.name);
        System.out.println(main.address);
        System.out.println(main.salary);
    }
}
