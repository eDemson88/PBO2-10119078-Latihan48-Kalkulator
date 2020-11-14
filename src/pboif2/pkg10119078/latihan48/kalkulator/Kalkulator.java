/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan48.kalkulator;

/**
 *
 * @author ryzen
 */
public class Kalkulator {
    private double value1,value2;
    
    public double getValue1(){
        return value1;
    }
    
    public void setValue1(double value1){
        this.value1=value1;
    }
    
    public double getValue2(){
        return value2;
    }
    
    public void setValue2(double value2){
        this.value2=value2;
    }
    
    public void setNameProject(){
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(String note){
        System.out.println("This Project shows you how to manage method in Java");
    }
    
    public double add(double value1, double value2){
        double add;
        
        add = value1 + value2;
        System.out.println("Result add is = " + add);
        return add;
    }
    
    public double minus(double value1, double value2){
        double minus;
        
        minus = value1 - value2;
        System.out.println("Result minus is = " + minus);
        return minus;
    }
    
    public double multiplication(double value1, double  value2){
        double mult;
        
        mult = value1 * value2;
        System.out.println("Result multiplication is = " + mult);
        return mult;
    }
    
    public double division(double value1, double value2){
        double divi;
        
        divi = value1 / value2;
        System.out.println("Result division is = " + divi);
        return divi;
    }
    
}
