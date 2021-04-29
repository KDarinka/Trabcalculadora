/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_3;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class act_3 {
    int suma; 
    int fact;
    int FACTORIAL;
    int media;
    int Num;
    int diasemana;
    int Modelo;
    //SUMA DEL 0 AL 10
    
    public static void suma(){
        
        int suma = 0;
        int i;
        for (i = 1; i <= 10; i++){
            suma +=i;
        }
        System.out.println("la suma de los numeros del 1 al 10 son de: " + suma);
    }
//    FACTORIAL DEL 1 AL 10
    public static void fact(){
        int fact = 1;
        for (int i = 10; i >= 1; i--){
        fact *=i;
    }
        System.out.println("el factorial de 10 es de: " + fact);
    }
    //FACTORIAL DE UN NUMERO INTRODUCIDO POR EL USUARIO
    public static void FACTORIAL(){
        Scanner entrada = new Scanner(System.in);
         int num = entrada.nextInt();
      int FACTORIAL = 1;
         for (int i = num ; i >= 1; i--) {
         FACTORIAL *= i;
    }
         System.out.println("El factorial de " + num +  " es: " + FACTORIAL);
    }
    //CALCULAR LA MEDIA DE UNA SUMA DEL 0 HASTA EL NUMERO INTRODUCIDO POR EL USUARIO
    public static void media(){
        int NUM = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar la cantidad de numeros que le gustaria sacar para la media: ");
        NUM = (int) sc.nextDouble();  
        
        double numeros[]= new double[NUM];
         for(int i = 0; i < NUM ; i++)
         {
             System.out.println("ingresar numero : ") ;
             numeros[i]= sc.nextDouble();
         }
             //CALCULAR LA MEDIA 
         double media;
         double suma = 0;
         for (double i: numeros){
         suma = suma+i;
             }
         media = suma / NUM;
         System.out.println(" la media es: " + media);
    }
    //PEDIR UN NUMERO Y LEER N VECES NUMEROS, REALIZAR LA SUMA DE LOS NUMEROS,
    //SACAR EL PROMEDIO Y DETERMINAR CUAL NUMERO INTRODUCIDO ES EL MENOR Y 
    //CUAL ES EL MAYOR Y LA DISTANCIA NUMERICA ENTRE ELLOS
    public static void Num(){
        int n = 0;
        int numeros;
        int suma = 0;
        //SUMA
        Scanner sc = new Scanner (System.in);
        System.out.println("ingresar la cantidad de numeros deseados a sumar: ");
        numeros =sc. nextInt();
        System.out.println("favor de ingresar los numeros: ");
        for (int i = 0; i < numeros; i++){
            n= sc. nextInt();
            suma = n + suma;
        }
        System.out.println("la suma de los numeros es: " + suma);
        //PROMEDIO
        double prom;
        prom = (double)suma / (double)numeros;
        System.out.println("el promedio de los numeros es: " + prom);
        // NUM. MAYOR Y MENOR
        
        int ma = 0, me =1;
        for(int i = 0; i < numeros; i++){
            
            if (numeros > ma){
                ma = n;
            }
            else if (numeros < me){
                me = n;
            }
            System.out.println("el numero mayor es: " + ma);
            System.out.println("el numero menor es: " + me);
        }
        //DIFERENCIA
        int dif;
        dif = ma - me;
        System.out.println("la diferencia entre el numero mayor y menor es: " + dif );
    }
    //ARREGLO QUE TENGA LOS NOMBRES DE LOS DIAS DE LA SEMANA
    public static void diasemana(){
        
        String dias[] = new String [7];
        dias [0] = "Lunes";
        dias [1] = "Martes";
        dias [2] = "Miercoles";
        dias [3] = "Jueves";
        dias [4] = "Viernes";
        dias [5] = "Sabado";
        dias [6] = "Domingo";
        
        for (String dia: dias){
            System.out.println("dia");
        }
    //MODELO DE JUEGO GATO
    }
    public static void Modelo(){
        
        String Modelo [][] = new String [3][3];
        for (String vertical[]: Modelo){
            for (String horizontal: vertical){
                System.out.println("+" + " ");
            }
            System.out.println("");
            
        }
    }

    
    }
        
        
    

