package com.mycompany.tallerparte2;
import java.util.Scanner;
public class Tallerparte2 {

public static Scanner leer;
public static float leernumero(String numero){
        
        float Numero;
        System.out.println("Indique los " + numero + " : ");
        Numero = leer.nextInt();
        return Numero;
    }
    
     public static float yarda(int n1){
     float yarda;
     yarda = (float) (n1 * 1.0936133);
     return yarda;
     }
    
    public static float pies(int n1){
     float pies;
     pies = (float) (n1 * 3.2808399);
     return pies;
     }
    
    public static float centimetros(int n1){
     float centimetros;
     centimetros = n1 * 100 ;
     return centimetros;
     }
    
    public static float pulgadas(int n1){
     float pulgadas;
     pulgadas = (float) (n1 * 39.3700787);
     return pulgadas;
     }
    
    public static void Resultados(float Y, float P, float C, float PL){
        System.out.println("Sus resutados son: " );
        System.out.println("Yardas: "+ Y);
        System.out.println("Pies: "+ P);
        System.out.println("Centimetros: "+ C);
        System.out.println("Pulgadas: "+ PL);
        
    }
 
    public static void main(String[] args) {
        
        leer = new Scanner(System.in);
        float n1,op_yarda,op_pies,op_centimetros,op_pulgadas;
         
        
        n1 = leernumero("metros");
        
        
        op_yarda = yarda((int) n1);
        op_pies = pies((int) n1);
        op_centimetros = centimetros((int) n1);
        op_pulgadas = pulgadas((int) n1);
        
        Resultados(op_yarda,op_pies,op_centimetros,op_pulgadas);
        
       
    }
}
