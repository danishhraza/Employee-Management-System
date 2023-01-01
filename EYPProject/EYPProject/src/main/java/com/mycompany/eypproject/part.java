/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eypproject;

/**
 *
 * @author Danish
 */
public class part extends Employee {
    //Part-Timer
    private double wage;
    private int workHours;
    private double salary;
    private double monthsalary;
    private static double maxhours = 20;
    private static final char type = 'P';

    public part(String ID, String password, String Gender, String Fname, String Lname, String Contact, String Email,double wage, char type) {
        super(ID, password, Gender, Fname, Lname, Contact, Email, type);
        this.wage = wage;
        this.workHours=0;
        this.monthsalary=0;
    }

    public double getWage() {
        return wage;
    }

    public double getSalary() {
        this.salary = workHours*wage;
        return (salary+monthsalary);
    }

    public void resetweek(){
        this.workHours=0;
        this.monthsalary=this.salary;
        
    }
    public void work()throws CustomException{
        if (workHours<maxhours)
            workHours+=4;
        else throw new CustomException("Hours exceeded");
    }
    public void work(int a )throws CustomException{
        if (workHours+a<=maxhours){
            workHours =workHours+a;
        }
        else throw new CustomException("Hours exceeded");
    }
    public int getHours(){
        return workHours;
    }


    public String toString(){
        String s = super.toString();
        s = s+"\r\nCurrent Salary: "+getSalary();
        return s;
    }
}
