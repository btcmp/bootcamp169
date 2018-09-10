/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp168.logic5;

import com.xsis.bootcamp169.logic2.*;
import com.xsis.bootcamp169.utils.MyLoop;
import java.util.Arrays;

/**
 *
 * @author arrizaqu
 */
public class Soal1B {
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
        this.matrix = new String[this.baris][this.kolom];
        MyLoop lp = new MyLoop();
        int[] dataFib = lp.getBilanganTringularFrom0(n);
        System.out.println(Arrays.toString(dataFib));
      
        for(int bangun = 0; bangun < n; bangun++){
            for (int i = dataFib[bangun] ; i < dataFib[bangun + 1]; i++) {
                for (int j = dataFib[bangun]; j < dataFib[bangun + 1]; j++) {
                    this.matrix[i][j] = "*";
                }
            }
        }
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < 1; j++) {
//                this.matrix[i][j] = "*";
//            }
//        }
//        for (int i = 1; i < 3; i++) {
//            for (int j = 1; j < 3; j++) {
//                this.matrix[i][j] = "*";
//            }
//        }
//        for (int i = 3; i < 6; i++) {
//            for (int j = 3; j < 6; j++) {
//                this.matrix[i][j] = "*";
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
        Soal1B template = new Soal1B();
        template.setMatrix(4);
        template.showMatrix();
    }
    
}
