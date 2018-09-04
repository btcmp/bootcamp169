/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic1;

import java.util.Arrays;

/**
 *
 * @author arrizaqu
 */
public class MyArray {
    
    //fungsi ganjil
    //output : 1, 3, 5, 7 ... 
    public int[] getGanjil(int n){
        int[] data = new int[n];
        int start = 1;
        for(int index = 0; index < n; index++){
            data[index] = start;
            start = start + 2;
        }
        return data;
    }
    
    public static void main(String[] args) {
        MyArray ma = new MyArray();
        int[] data = ma.getGanjil(9);
        System.out.println(Arrays.toString(data));
        
        //deklarasi 1
        String[] cities = new String[5];
        cities[0] = "jakarta";
        cities[1] = "jawa barat";
        cities[2] = "jawa tengah";
        cities[3] = "jawa timur";
        cities[4] = "palembang";
        
        // jawa tengah 
        System.out.println(" index ke 2 "+ cities[2]);
        
        //for
        for(int i = 0; i < cities.length; i++){
            System.out.println(" city : "+ i + " : "+ cities[i]);
        }
        
        //foreach
        for(String city : cities){
            System.out.println(" another city : "+ city);
        }
        
        //show simple value
        System.out.println(Arrays.toString(cities));
    }
}
