package com.mycompany.taller1;
import java.util.Scanner;
public class Taller1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        String nombre;
        int cedula;
        int edad;
        int sxH;
        int horastrabajadas;
        
        float salarioganado;
        
        System.out.println("Digite su nombre: ");
        
        nombre = leer.next();
        
        System.out.println("Digite su numero de identificacion: ");
        cedula= leer.nextInt();
        
        System.out.println("Digite su edad");
        edad = leer.nextInt();
        
        System.out.println("Digite digite su salario por hora: ");
        sxH = leer.nextInt();
        
        System.out.println("Digite las horas trabajadas: ");
        horastrabajadas = leer.nextInt();
        
        
        salarioganado = (sxH * horastrabajadas);
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad + "\n" + "Cedula: " + cedula + "\n" + "Salario total: " + salarioganado);
        salarioganado = leer.nextInt();
       
        
    }
}
