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
public class Company {
    //property //default value
    String name="PT. xsis mitra utama";
    String address;
    String moto;
    
    //get name
    public String getName(){
        String a = this.name;
        return a;
    }
    public String getAddress(){
        return this.address;
    }
    public String getMoto(){
        return this.moto;
    }
   
    
    //set name etc..
    public void setName(String ab){ // ab -> parameter
        this.name = ab;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setMoto(String moto){
        this.moto = moto;
    }
    //RETURN METHOD : INFO -> get
    //result : nama comapany : .... ....
    public String getInfoCompany(){
        String info = "nama company : "+ this.name + 
                                        ", address : "+ this.address;
        return info;
    }
    
    //VOID -> set
    public void setAddress(){
        this.address = "Jl. jendral Strio";
    }

    public static void main(String[] args) {
        Company company = new Company();
        //session 2
        String myArgs= "XSIS ACADEMY";
        company.setName(myArgs); //-> argument
        company.setAddress("jalan Satrio");
        System.out.println(""+ company.getInfoCompany());
        
        //injection value
//        company.name = "Xsis Academy";
//        company.address = "Jalan langsat";
//        company.moto = "winners";
//        company.setAddress();
//        String info = company.getInfoCompany();
//        System.out.println("info : "+ company.getInfoCompany());
//        System.out.println("name company : "+ company.name);
//        System.out.println("address company : "+ company.address);
//        System.out.println("moto : "+ company.moto);

        
        
        
    }
}
