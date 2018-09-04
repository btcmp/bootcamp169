/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic2;

import com.xsis.bootcamp169.utils.DeretAngka;
import java.util.Arrays;

/**
 *
 * @author arrizaqu
 */
public class Soal3 {

    //step 1
    int baris = 0;  //baris matrix
    int kolom = 0;  //kolom matrix
    String[][] data; //matrix
    
    
    //step 2 => set data array dengan input n
    public void setDataArray(int n){
        this.baris = n;
        this.kolom = n;
        this.data = new String[this.baris][this.kolom];
    
        DeretAngka da = new DeretAngka();
        int[] dataGanjil = da.getGanjil(n);
        int[] dataGenap = da.getGenap(n);
        
        System.out.println(Arrays.toString(dataGanjil));
        System.out.println(Arrays.toString(dataGenap));
        
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                if(i == j){
                    data[i][j] = dataGanjil[i] +"";
                } else if(i + j == n - 1){
                    data[i][j] = dataGenap[n-1-i] +"";
                }
            }
        }
    }
    
    //step 3 => menampilkan array
    public void showArray(){
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                System.out.print(""+ data[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Soal3 jawab = new Soal3();
        jawab.setDataArray(9);
        jawab.showArray();
    }
}
