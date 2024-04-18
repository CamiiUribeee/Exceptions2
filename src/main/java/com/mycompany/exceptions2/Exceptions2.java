

package com.mycompany.exceptions2;

import java.util.InputMismatchException;
import java.util.Scanner;


//EJEMPLO DONDE SE PIDA UN NUMERO 
public class Exceptions2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int number; 
        
        try{
            System.out.println("Ingrese un valor entero: ");
            number= scanner.nextInt(); 
            int square = number * number; 
            System.out.println("El cuadrado de " + "" + number + " es: " + square); 
        } catch(InputMismatchException ex){    //esto siempre se importa  
            System.out.println("Debe ingresar valores numericos"); 
        }
        
        
        
        
        
    }
}


