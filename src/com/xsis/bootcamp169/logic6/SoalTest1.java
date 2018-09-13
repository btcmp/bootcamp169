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
public class SoalTest1 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = n*n;
        this.kolom = n*n;
        this.matrix = new String[this.baris][this.kolom];
        int start = getFirst(n);
        int geserI = 0;
        int hasilBangun = 1;
        for(int block = 0; block < n; block++){
            int geserJ = 0;
            
            
            for(int bangun = 0; bangun < n; bangun++){
                for (int i = 0; i < this.baris; i++) {
                    int index = 0;
                    for (int j = 0; j < this.kolom; j++) {
                        //fokus ke piramid
                        if(i + j >= n/2 && j - i <= n/2 && i - j <= n/2 && i+j <= n + n /2 -1){
                            if(block == bangun){
                                if(j < n/2){
                                    //this.matrix[i+geserI][j+geserJ] = start - index++ + "";
                                } else {
                                    //this.matrix[i+geserI][j+geserJ] = start - index-- + "";
                                }
                                 this.matrix[i+geserI][j+geserJ] = hasilBangun + (j) + "";
                                
                            } 
                        }
                    }
                }
                geserJ = geserJ + (n);
            }
            geserI = geserI + (n);
            hasilBangun = hasilBangun + n;
        }
    }
    
    public int getFirst(int n){
        int increment = 0;
        for(int i = 1; i <= n;i++){
            if(i % 2 == 1){
                increment = increment + 1;
            }
        }
        return increment;
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
        SoalTest1 template = new SoalTest1();
        template.setMatrix(5);
        template.showMatrix();
    }
    
}
