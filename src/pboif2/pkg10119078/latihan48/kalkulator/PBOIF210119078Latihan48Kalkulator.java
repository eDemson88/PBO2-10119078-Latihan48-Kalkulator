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
public class PBOIF210119078Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator calc = new Kalkulator();
        
        calc.setValue1(7);
        calc.setValue2(5);
        System.out.println("VALUE 1 = " + calc.getValue1());
        System.out.println("VALUE 2 = " + calc.getValue2());
        calc.setNameProject();
        calc.setNoteProject("");
        calc.add(calc.getValue1(), calc.getValue2());
        calc.minus(calc.getValue1(), calc.getValue2());
        calc.multiplication(calc.getValue1(), calc.getValue2());
        calc.division(calc.getValue1(), calc.getValue2());
    }
    
}
