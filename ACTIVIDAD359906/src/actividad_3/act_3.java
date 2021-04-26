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
    int dias;
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
        System.out.println("introducir un numero para calcular su factorial");
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
        
        double Num[]= new double[NUM];
         for(int i = 0; i < NUM ; i++)
         {
             System.out.println("ingresar numero : ") ;
             Num[i]= sc.nextDouble();
         }
             //CALCULAR LA MEDIA 
         double media;
         double suma = 0;
         for (double i: Num){
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
        int Num;
        int suma = 0;
        //SUMA
        Scanner sc = new Scanner (System.in);
        System.out.println("ingresar la cantidad de numeros deseados a sumar: ");
        Num =sc. nextInt();
        System.out.println("favor de ingresar los numeros: ");
        for (int i = 0; i < Num; i++){
            n= sc. nextInt();
            suma = n + suma;
        }
        System.out.println("la suma de los numeros es: " + suma);
        //PROMEDIO
        double prom;
        prom = (double)suma / (double)Num;
        System.out.println("el promedio de los numeros es: " + prom);
   
// NUM. MAYOR Y MENOR
        
        int ma = 0, me =1;
        for(int i = 0; i < Num; i++){
            
            if (Num > ma){
                ma = n;
            }
            else if (Num < me){
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
    public static void dias(){
        
        String dia[] = new String [7];
        dia [0] = "Lunes";
        dia [1] = "Martes";
        dia [2] = "Miercoles";
        dia [3] = "Jueves";
        dia [4] = "Viernes";
        dia [5] = "Sabado";
        dia [6] = "Domingo";
        
        for (String dias: dia){
            System.out.println(dias);
        }
    //MODELO DE JUEGO GATO
    }
    public static void Modelo(){
        
        String Modelo [][] = new String [3][3];
        
        for (String vertical[]: Modelo){
            for (String horizontal: vertical){
                System.out.print("_" + " ");
            }
            System.out.println("");
            
        }
    }

 
    }
        
        
    

