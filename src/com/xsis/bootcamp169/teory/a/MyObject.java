/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xsis.bootcamp169.teory.a;

/**
 *
 * @author arrizaqu
 */
public class MyObject {
    private String myPrivate;
    protected String myProtected;
             String myDefault;
    public String myPublic;
    
    public void access(){
        //access by instance
        MyObject mb = new MyObject();
        mb.myPrivate="private";
        mb.myDefault="default";
        mb.myProtected="protected";
        mb.myPublic="public";
        
        //access by inheritance
        this.myPrivate="private";
        this.myDefault="default";
        this.myProtected="protected";
        this.myPublic="public";
        
    }
}
