/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic3;

import com.xsis.bootcamp169.logic1.*;
import com.xsis.bootcamp169.utils.DeretAngka;
import java.util.Arrays;

/**
 *
 * @author arrizaqu
 */
public class Soal9 {
   
    int baris = 0;
    int kolom = 0;
    
    public void tampilkan(int n){
        this.baris = n;
        this.kolom = n;
        DeretAngka da = new DeretAngka();
        String[] dataFib = da.fibBlank(n);
        System.out.println(Arrays.toString(dataFib));
        
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                if(i + j <= n - 1 && i >= j){ // yang kiri
                   System.out.print(dataFib[j]+ "\t");
                } else if(i + j >= n - 1 && i <= j){ // yang kanan
                    System.out.print(dataFib[n-1-j] +"\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args){
        Soal9 quiz = new Soal9();
        quiz.tampilkan(11);
    }
    
}
