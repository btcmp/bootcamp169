/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.utils;

import java.util.Arrays;

/**
 *
 * @author arrizaqu
 */
public class DeretAngka {
    
    //1, 3, 5 .. etc
    public int[] getGanjil(int n){
        int[] data = new int[n];
        int start = 1;
        for(int index = 0; index < n; index++){
            data[index] = start;
            start = start + 2;
        }
        return data;
    }
    
    //0, 2, 4, ..
    public int[] getGenap(int n){
        int[] data = new int[n];
        int start = 0;
        for(int index = 0; index < n; index++){
            data[index] = start;
            start = start + 2;
        }
        return data;
    }
    
    //1,1,2,3,5, .. etc
    public int[] getFib(int n){
        int[] dataFib = new int[n];
        dataFib[0] = 1;
        dataFib[1] = 1;
        for (int i = 2; i < n; i++) {
            dataFib[i] = dataFib[i - 1] + dataFib[i - 2];
        }
        return dataFib;
    }
    
    //output : 1, ,3, ,5 ...
    public String[] increment(int n){
        String[] data = new String[n];
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                data[i] = (i + 1) + "" ;
            } else{
                data[i] = "";
            }
            
        }
        return data;
    }
    
    public String[] getAbjad(int n){
        String[] a = {
            "A","B","C", "D", "E", "F", "G"
        };      
        return a;
    }
    
    //output : 1, ,1, ,2, ,3, , etc..
    public String[] fibBlank(int n){
        String[] data = new String[n];
        int[] dataFib = getFib(n);
        String[] abjad = getAbjad(n);
        
        int index = 0;
        int index2 =0;
        
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) 
                data[i] = dataFib[index++]+"";
            else 
                data[i] = abjad[index2++] +"";
        }
        
        return data;
    }
    
    public static void main(String[] args) {
        DeretAngka da = new DeretAngka();
        String[] result = da.fibBlank(9);
       
        System.out.println(Arrays.toString(result));
    }
}
