/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic4;

import com.xsis.bootcamp169.logic2.*;
import com.xsis.bootcamp169.utils.DeretAngka;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author arrizaqu
 */
public class Soal8 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = n;
        this.kolom = n;
        this.matrix = new String[this.baris][this.kolom];
        int[] dataGanjil = DeretAngka.getGanjil(n);
        System.out.println(Arrays.toString(dataGanjil));
        
        for (int i = 0; i < this.baris; i++) {
             //int index  = 0;
             for (int j = 0; j < this.kolom; j++) {
                if(i + j >= this.kolom / 2 && (j - i <= this.kolom / 2) && (i - j <= this.kolom / 2) && (i+j) <= this.baris + (this.baris / 2) -1){
                    if(j < this.kolom / 2){
                        this.matrix[i][j] = "*";
                      //   this.matrix[i][j] = dataGanjil[index++] + "";
                    } else {
                        this.matrix[i][j] = "*";
                       // this.matrix[i][j] = dataGanjil[index--] + "";
                    }
                } 
             }
        }
    }
    
    public void showMatrix(){
    
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                System.out.print(""+ this.matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Soal8 template = new Soal8();
        
        //menunggu inputan dari keyboard
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Masukkan angka >> ");
//        int n = scan.nextInt();
        
        template.setMatrix(9);
        template.showMatrix();
    }
    
}
