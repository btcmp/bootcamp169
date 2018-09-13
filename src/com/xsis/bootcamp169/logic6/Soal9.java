/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic6;

import com.xsis.bootcamp169.logic2.*;

/**
 *
 * @author arrizaqu
 */
public class Soal9 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        
        this.baris = (n-1)*2;
        this.kolom = this.getMaxHorizontal(n);
        int start = n - 1;
        int addStart = 0;
        this.matrix = new String[this.baris][this.kolom];
        int var = start - 1;
        int index = 1;
        for(int bangun = 0; bangun < n; bangun++){
            for (int i = 0; i < start+bangun; i++) {
                for (int j = 0; j < start+bangun; j++) {
                    if(i+j == var || j == var || i == var){
                        this.matrix[i+start-bangun][j+addStart] = index + j + "";
                    } 
                }
            }
         addStart = addStart + start + bangun;   
         var = var + 1;
         index = index + start + bangun;
        }
    }
    
    public int getMaxHorizontal(int n){
        int genap = 0;
        int inc = 0;
        int hasil = 0;
        for(int i = 0; i < n; i++){
            hasil = hasil + (genap + inc);
            genap = genap + 2;
            inc = inc + 1;
        }
        
        return hasil;
    }
    
    public void showMatrix(){
    
        int geser = 0;
        
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                System.out.print(""+ this.matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Soal9 template = new Soal9();
        template.setMatrix(3);
        template.showMatrix();
    }
    
}
