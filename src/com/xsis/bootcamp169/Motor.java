/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169;

/**
 *
 * @author arrizaqu
 */

public class Motor {

    //property
    String warna;
    String merk;
    int jumlahRoda;
    String platNomor;
    int incrment = 0;
    
    public void addIndex(){
        this.incrment = this.incrment + 1;
        if(this.incrment <= 60){
            System.out.println("" + (this.incrment * 23));
            addIndex();
        }
    }
    
    //getter
    public String getWarna(){
       return this.warna;
    }
    public String getMerk(){
       return this.merk;
    }
    public int getJumlahRoda(){
        return this.jumlahRoda;
    }
    public String getPlatNomor(){
        return this.platNomor;
    }
    
    //setter
    public void setWarna(String warna){
        this.warna = warna;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setJumlahRoda(int jumlah){
        this.jumlahRoda = jumlah;
    }
    public void setPlatNomor(String plat){
        //this.setPlatNomor(plat);
        this.platNomor = plat;
    }

    
    public static void main(String[] args){
        Motor motor = new Motor();
        motor.addIndex();
        
        motor.setWarna("biru");
        motor.setPlatNomor("B 4658 CD");
        //----- etc
        System.out.println("warna : "+ motor.getWarna());
        System.out.println("merk : "+ motor.getMerk());
        System.out.println("roda : "+ motor.getJumlahRoda());
        System.out.println("plat nomor : "+ motor.getPlatNomor());
//        motor.warna = "hitam";
//        motor.merk = "N max";
//        motor.jumlahRoda = 2;
//        motor.platNomor = "12345678";
//
//    System.out.println("warna : "+ motor.warna);
//    System.out.println("merk : "+ motor.merk);
//    System.out.println("jumlah roda : "+ motor.jumlahRoda);
//    System.out.println("plat nomor : "+ motor.platNomor);
    }

}
