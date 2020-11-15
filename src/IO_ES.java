/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 * Esta clase contiene los métodos estáticos que permiten la lectura de 
 * distintos tipos de datos desde teclado y muestra texto por consola.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class IO_ES {
    
    
    static public int leerInteger(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¡Hola! Introduce un número entero, por favor: ");
        int numero = teclado.nextInt();
        
        return numero ;
        
    }
    
    static public float leerReal(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¡Hola! Introduce un número real, por favor: ");
        float numero = teclado.nextFloat();
        
        return numero ;
        
    }
    
    static public long leerIntegerLargo(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¡Hola! Introduce un número entero largo, por favor: ");
        long numero = teclado.nextLong();
        
        return numero ;
        
    }
    
    static public double leerRealLargo(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¡Hola! Introduce un número real largo, por favor: ");
        double numero = teclado.nextDouble();
        
        return numero ;
        
    }
    
    static public void escribir(String mensaje){
        
        System.out.print(mensaje);
        
    }
    
    static public void escribirLN(String mensaje){
        
        System.out.println(mensaje);
        
    }
    
}
