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
public class Soal1B2 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public int getMaxWidthColumn(int n){
        MyLoop lp = new MyLoop();
        int hasil = lp.getBilanganTringularAkhir(n);
        return hasil;
    }
    
    public int getMaxWidthRow(int n){
        MyLoop lp = new MyLoop();
        int hasil = lp.getBilanganTringularAkhir(n);
        return hasil;
    }
    
    public void setMatrix(int n){
        this.baris = getMaxWidthColumn(n);
        this.kolom = getMaxWidthRow(n);
        MyLoop lp = new MyLoop();
        int[] geser = lp.getBilanganTringularFrom0(n);
        
        this.matrix = new String[this.baris][this.kolom];
        for(int bangun = 0; bangun < n; bangun++){
            for (int i = 0; i < bangun+1; i++) {
                for (int j = 0; j < bangun+1; j++) {
                    this.matrix[i + geser[bangun]][j + geser[bangun]] = "*";
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
        Soal1B2 template = new Soal1B2();
        template.setMatrix(4);
        template.showMatrix();
    }
    
}
