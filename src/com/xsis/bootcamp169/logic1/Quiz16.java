/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic1;

/**
 *
 * @author arrizaqu
 */
public class Quiz16 {
   
    int baris = 0;
    int kolom = 0;
    
    public void tampilkan(int n){
        this.baris = n;
        this.kolom = n;
        
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                if( i >= j){
                    System.out.print(j + "," + i + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args){
        Quiz16 quiz = new Quiz16();
        quiz.tampilkan(8);
    }
    
}
