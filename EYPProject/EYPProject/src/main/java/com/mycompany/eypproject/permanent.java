/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eypproject;

/**
 *
 * @author Danish
 */
public class permanent extends Employee{
    //Full Timer

    private double wage;
    private int workHours;
    private double salary;
    private static final double maxhours=56;
    private double overTimeWage;
    private double overTime;
    private double monthsalary;
    private String position;
    private static final char type = 'F';

    public permanent(String ID,String password,String Gender,String Fname,String Lname,String Contact,String Email,double wage,double overTimeWage,String position, char type){
        super(ID, password, Gender, Fname, Lname, Contact, Email, type);
        this.wage=wage;
        this.overTimeWage=overTimeWage;
        this.position=position;
        this.workHours=0;
        this.monthsalary=0;
    }

    public void setOverTimeWage(double overTimeWage) {
        this.overTimeWage = overTimeWage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getSalary() {
        if (this.workHours>39 ){
            Overtime();
            salary=(40*wage)+overTime;
        }
        else {
            salary=(workHours*wage);
        }
        return (salary+monthsalary);
    }

    public double getWage() {
        return wage;
    }

    public int getWorkHours() {
        return workHours;
    }

    public double getOverTimeWage() {
        return overTimeWage;
    }

    public String getPosition() {
        return position;
    }

    public double getOverTime() {
        return overTime;
    }

    public void work()throws CustomException{
        if (this.workHours+8<maxhours)
        this.workHours+=8;
        else throw new CustomException("Hours exceeded");
    }
    public void work(int a)throws CustomException{
        while(a>0){
        System.out.println("working for "+a+" hours");
        if ((this.workHours+a)<57){
            this.workHours =this.workHours+a;
            System.out.println("new hours: "+this.workHours);
        }
        else throw new CustomException("Hours exceeded");         
        }
    }

    public void Overtime(){
        double a = getWorkHours();
        a-=40;
        this.overTime = a * this.overTimeWage;
    }
    
    public void resetweek(){
        this.workHours=0;
        this.monthsalary=this.salary;        
    }

    public String toString(){
        String s = super.toString();
        s = s+"\r\nCurrent Salary: "+getSalary();
        return s;
    }
}
