/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic3;

import com.xsis.bootcamp169.utils.DeretAngka;

/**
 *
 * @author arrizaqu
 */
public class PR {
    
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
         baris = n;
         kolom = n * 2 - 1;
        this.matrix = new String[this.baris][this.kolom];
        int[] dataFib = DeretAngka.getFib(n);
        
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                if(i == j ){
                    this.matrix[i][j] = dataFib[i] + "";
                    this.matrix[i][j + (n-1)] = dataFib[n - 1 - i] + "";
                } else if(i + j == n - 1){
                    this.matrix[i][j] = dataFib[n - 1 - i] + "";
                    this.matrix[i][j + (n-1)] = dataFib[i] + "";
                }
                
            }
        }
        
    }
    
    public void showMatrix(){
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                System.out.print(""+this.matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        PR pr = new PR();
        pr.setMatrix(9);
        pr.showMatrix();
    }
    
}
