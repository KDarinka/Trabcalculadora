/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacalculadora;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class Tareacalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner miConsola = new Scanner(System.in);
        System.out.println("introduce numero 1 ");
        double a =miConsola.nextDouble();
          System.out.println("introduce  numero 2");
        double b =miConsola.nextDouble();
        
        Calculadora Calc = new Calculadora();
        Calc.setnumeros(a, b);
        Calc.imprimenum();
        System.out.println("suma: " + Calc.sumar());
        System.out.println("resta: " + Calc.restar());
        System.out.println("multiplicacion: " + Calc.multiplicar());
        System.out.println("division: " + Calc.dividir());
        
    }
    
}
