/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic5;

import com.xsis.bootcamp169.logic2.*;
import com.xsis.bootcamp169.utils.MyLoop;

/**
 *
 * @author arrizaqu
 */
public class Soal1 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public int getMaxWidth(int n){
        MyLoop ml = new MyLoop();
        int hasil = ml.getBilanganTringularAkhir(n);
        return hasil;
    }
    
    
    public void setMatrix(int n){
        this.baris = getMaxWidth(n);
        this.kolom = getMaxWidth(n);
        this.matrix = new String[this.baris][this.kolom];
        MyLoop ml = new MyLoop();
        int[] geser = ml.getBilanganTringularFromZero(n);
        for(int bangun = 0; bangun < n; bangun++){
            for (int i = 0; i < bangun+1; i++) {
                for (int j = 0; j < bangun+1; j++) {
                      this.matrix[i+geser[bangun]][j+geser[bangun]] = "*"; 
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
        Soal1 template = new Soal1();
        template.setMatrix(3);
        template.showMatrix();
    }
    
}
