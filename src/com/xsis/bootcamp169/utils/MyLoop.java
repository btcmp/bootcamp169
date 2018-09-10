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
public class MyLoop {
    
    //1,2,3,4,5..
    public void increment(int n){
        int t = 10;
        int index = 0;
        for (int i = 0 ; i < n; i++) {
            System.out.println("loop ke "+ index + ", money : "+ t);
            
            t = t+ 100;
            index = index + 1;
        }
    }
    /*
    1 + 0 = 1
    2 + 1 = 3
    3 + 3 = 6
    4 + 6 = 10
    5 + 10 = 15
    */
//triangular output : 1, 3, 6, 10, 15, 
    public int getBilanganTringularAkhir(int n){
        int index = 1;
        int hasil = 0;
        for (int i = 0; i < n; i++) {
            hasil = hasil + (index);
            index++;
        }
        return hasil;
    }
    
    public int[] getBilanganTringular(int n){
        int[] data = new int[n];
        int index = 1;
        int hasil = 0;
        for (int i = 0; i < n; i++) {
            hasil = hasil + (index);
            data[i] = hasil;
            index++;
        }
        return data;
    }
    
    public int[] getBilanganTringularFrom0(int n){
        int[] data = new int[n + 1];
        int index = 1;
        int hasil = 0;
        for (int i = 0; i < n + 1; i++) {
            data[i] = hasil;
            hasil = hasil + (index);
            index++;
        }
        return data;
    }
    
    
    public int[] getBilanganTringularFromZero(int n){
        int[] data = new int[n + 1];
        int index = 1;
        int hasil = 0;
        for (int i = 0; i < n + 1; i++) {
            data[i] = hasil;
            hasil = hasil + (index);
            index++;
        }
        return data;
    }
    
    public static void main(String[] args) {
        MyLoop ml = new MyLoop();
        int hasil = ml.getBilanganTringularAkhir(4);
        int[] data = ml.getBilanganTringularFrom0(4);
        System.out.println("hasil : " + hasil);
        System.out.println(Arrays.toString(data));
    }
    
}
