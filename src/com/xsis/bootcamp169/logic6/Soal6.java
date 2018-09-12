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
public class Soal6 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = n*n;
        this.kolom = n*n;
        this.matrix = new String[this.baris][this.kolom];
        
        int geserI = 0;
        for(int block = 0; block < n; block++){
            int geserJ = 0;
            for(int bangun = 0; bangun < n; bangun++){
                for (int i = 0; i < this.baris; i++) {
                    for (int j = 0; j < this.kolom; j++) {
                        //fokus ke piramid
                        if(i + j >= n/2 && j - i <= n/2 && i - j <= n/2 && i+j <= n + n /2 -1){
                            if(block == bangun){
                                this.matrix[i+geserI][j+geserJ] = bangun + "";
                            } else if(bangun + block == n - 1){
                                 this.matrix[i+geserI][j+geserJ] = geserJ + "";
                            }
                            
                        }
                    }
                }
                geserJ = geserJ + (n);
            }
            geserI = geserI + (n);
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
        Soal6 template = new Soal6();
        template.setMatrix(5);
        template.showMatrix();
    }
    
}
