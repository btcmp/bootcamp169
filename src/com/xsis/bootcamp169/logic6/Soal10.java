/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic6;

import com.xsis.bootcamp169.logic2.*;
import com.xsis.bootcamp169.utils.DeretAngka;
import java.util.Arrays;

/**
 *
 * @author arrizaqu
 */
public class Soal10 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = n;
        this.kolom = n;
        this.matrix = new String[this.baris][this.kolom];
        int index = 1;
        DeretAngka da = new DeretAngka();
        int[] data1 = da.getGanjil(n);
        System.out.println(Arrays.toString(data1));
        
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                if(i >= j && i % 2 == 0){
                    this.matrix[i][j] = index + "";
                } else if(i + j >= n - 1 && i % 2 == 1){
                    this.matrix[i][j] = index +"";
                }
            }
            index = index + 1;
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
        Soal10 template = new Soal10();
        template.setMatrix(13);
        template.showMatrix();
    }
    
}
