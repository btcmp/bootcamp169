/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic5;

import com.xsis.bootcamp169.logic2.*;
import com.xsis.bootcamp169.utils.DeretAngka;
import com.xsis.bootcamp169.utils.MyLoop;

/**
 *
 * @author arrizaqu
 */
public class Soal3 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public int getMaxWidthColumn(int n){
        return n*n;
    }
    
    public int getMaxWidthRow(int n){
        MyLoop lp = new MyLoop();
        int hasil = lp.getBilanganTringularAkhir(n);
        return hasil;
    }
    
    public void setMatrix(int n){
        this.baris = getMaxWidthRow(n);
        this.kolom = getMaxWidthColumn(n);
        MyLoop lm = new MyLoop();
        
        int[] inc1 = DeretAngka.getIncrement(n);//new int[]{1,2,3,4};
        int[] inc2 = DeretAngka.getGanjil(n);//new int[]{1,3,5,7};
        //int[] inc3 = new int[]{0,1,2,3};
        int[] inc4 = lm.getBilanganTringularFrom0(n);//new int[]{0,1,3,6}; 
        int[] inc5 = lm.getQuadrat(n);//new int[]{0,1,4,9};
        
        this.matrix = new String[this.baris][this.kolom];
        for(int bangun = 0; bangun < n; bangun++){
            for (int i = 0; i < inc1[bangun]; i++) {
                for (int j = 0; j < inc2[bangun]; j++) {
                    if(i + j >= bangun && (j - i) <= bangun){
                        this.matrix[i+inc4[bangun]][j+inc5[bangun]] = "*";
                    }
                }
            }
        }
        
        
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < 1; j++) {
//                if(i + j >= 0 && (j - i) <= 0){
//                    this.matrix[i+0][j+0] = "*";
//                }
//            }
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                if(i + j >= 1 && (j - i) <= 1){
//                    this.matrix[i+1][j+1] = "*";
//                }
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                if(i + j >= 2 && (j - i) <= 2){
//                    this.matrix[i+3][j+4] = "*";
//                }
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 7; j++) {
//                if(i + j >= 3 && (j - i) <= 3){
//                    this.matrix[i+6][j+9] = "*";
//                }
//            }
//        }
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
        Soal3 template = new Soal3();
        template.setMatrix(10);
        template.showMatrix();
    }
    
}
