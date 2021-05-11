/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacalculadora;

/**
 *
 * @author carri
 */
public class Calculadora {
     private double a , b;
     public Calculadora(){
        
    }
    public void setnumeros(double x, double y){
        this.a = x;
        this.b = y;
    }
    public void imprimenum(){
        System.out.println("el numero 1 es:" +a+" y el 2 numero es: " +b);
    }
    public double sumar (){
        return a + b ;
    }
    public double restar (){
       if (a>b){
        return a - b ;
       }else{
           return b - a;
       }
    }
    public double multiplicar (){
      
     return a * b ;
       }
    public double dividir (){
       if (a>b){
        return a / b ;
       }else{
          return b / a;
       }
    }
    
    
}

