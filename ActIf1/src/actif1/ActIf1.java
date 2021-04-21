/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actif1;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class ActIf1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner miConsola = new Scanner (System.in);
        int ac = miConsola.nextInt();
       int ap = 0;

       if(ac < 2021){
           ap = 2021 - ac;
           System.out.println("Han pasado " + ap + " años");
       } else if(ac > 2021){
           ap = ac - 2021;
           System.out.println("Faltan " + ap + " años");
      
    }
    }
    
}
