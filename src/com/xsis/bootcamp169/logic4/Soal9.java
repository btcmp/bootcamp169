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
public class Soal9 {
    int baris;
    int kolom;
    String[][] matrix;
    
    public void setMatrix(int n, int n2){
        this.baris = n;
        int decrease = n2 - 1;
        this.kolom = n * n2 - decrease;
        this.matrix = new String[this.baris][this.kolom];
        int[] dataGanjil = DeretAngka.getGanjil(n);
        System.out.println(Arrays.toString(dataGanjil));
        int geser = 0;
        for(int bangun = 0; bangun < n2; bangun++){
            //object piramid
            for (int i = 0; i < this.baris; i++) {
                int index  = 0;
                for (int j = 0; j < this.kolom; j++) {
                    if(i + j >= n / 2 && (j - i <= n / 2) && (i - j <= n / 2) && (i+j) <= this.baris + (this.baris / 2) -1){
                        if(j < n / 2){
                            this.matrix[i][j + geser] = dataGanjil[index] + "";
                            index++;
                        } else {
                        //this.matrix[i][j] = "*";
                            this.matrix[i][j + geser] = dataGanjil[index] + "";
                            index--;
                        }   
                    } 
                }
            }
            geser = geser + (n - 1);
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
        Soal9 template = new Soal9();
        
        //menunggu inputan dari keyboard
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka 1>> ");
        int n = scan.nextInt();
        System.out.print("Masukkan angka 2 >> ");
        int n2 = scan.nextInt();
        
        template.setMatrix(n, n2);
        template.showMatrix();
    }
    
}
