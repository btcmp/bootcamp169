/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.logic2;

/**
 *
 * @author arrizaqu
 */
public class Template2 {
    
    int baris;
    int kolom;
    int geserBawah = 0;
    int geserKanan = 0;
    
    String[][] matrix;
    
    public void setMatrix(int n){
        this.baris = n;
        this.kolom = n;
        
        this.matrix = new String[this.baris][this.kolom];
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                setShape(matrix);
            }
        }
    }
    
    public void setShape(String[][] data){
        this.geserBawah = 0;
        this.geserKanan = 0;
        for(int shape = 0; shape < 4; shape++){
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    data[i+this.geserBawah][j+this.geserKanan] = "*";
                }
            }
            
            this.geserKanan = this.geserKanan + 2;
            this.geserBawah = this.geserBawah + 2;
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
        Template2 jawab = new Template2();
        jawab.setMatrix(9);
        jawab.showMatrix();
    }
}
