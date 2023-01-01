/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eypproject;

/**
 *
 * @author Danish
 */
import java.io.Serializable;

public abstract class Employee{
    // Parent class
    private String ID;
    private String password;
    private String Gender;
    private String Fname;
    private String Lname;
    private String Contact;
    private String Email;
    private char type;
    public Employee(String ID,String password,String Gender,String Fname,String Lname,String Contact,String Email, char type){
        this.ID=ID;
        this.password=password;
        this.Gender=Gender;
        this.Fname=Fname;
        this.Lname=Lname;
        this.Email=Email;
        this.Contact=Contact;
        this.type = type;
    }

    public String getLname() {
        return Lname;
    }

    public String getFname() {
        return Fname;
    }

    public String getEmail() {
        return Email;
    }

    public String getContact() {
        return Contact;
    }

    public String getGender() {
        return Gender;
    }

    public String getID(){
        return ID;
    }
    
    public String getPassword(){
        return password;
    }
    
    public char getType(){
        return type;
    }
    public String toString(){
        String etype="";
        if (this.type == 'P') etype=" Part Time";
        if (this.type=='F') etype=" Full Time";
        String s = ("Employee Name: "+this.Fname+" "+this.Lname+"\r\nGender: "+ this.Gender+"\r\nContact: "+this.Contact+"\r\nEmail: "+this.Email+"\r\nType: "+etype);
        return s;
    }
}
