

package com.mycompany.exceptions2;

import java.util.InputMismatchException;
import java.util.Scanner;


//EJEMPLO DONDE SE PIDA UN NUMERO 
public class Exceptions2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int number= readInteger("Escriba un numero: ");
        System.out.println("El valor obtenido es: " + number);
        
        
        /* do{
            try{
            System.out.println("Ingrese un valor entero: ");
            number= scanner.nextInt(); 
            int square = number * number; 
            System.out.println("El cuadrado de " + "" + number + " es: " + square);  
            break; 
        } catch(InputMismatchException ex){    //esto siempre se importa  
            System.out.println("Debe ingresar valores numericos");    
        }
        
        } while (true);  //revisar este do while */ 
    }  
    
    public static int readInteger(String data){
        boolean repeat; 
        int value = 0; 
        Scanner scanner = new Scanner(System.in); 
        do {
            repeat = false; 
            try{
                System.out.println(data); 
                value = scanner.nextInt(); 
            }catch (InputMismatchException e){
                System.out.println("Tipo de dato no valido");
                repeat = true; 
            } finally{
                System.out.println("Mensaje a mostrar siempre");
            }
        } while (repeat);
        return value; 
    }
}


