/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eypproject;

/**
 *
 * @author Danish
 */
public class Admin extends Employee{
    private static final char type = 'A';
    public Admin(String ID,String password,String Gender,String Fname,String Lname,String Contact,String Email, char type){
        super(ID, password, Gender, Fname, Lname, Contact, Email, type);
    }
}