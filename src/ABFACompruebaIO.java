/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 * Pide y muestra datos a partir de los métodos estáticos de la clase IO_ES.
 * 
 * @author Adrián Arjona
 * @version 1.0
 * 
 */
public class ABFACompruebaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaración de variables
        
        int opcion ;
        Scanner teclado = new Scanner(System.in);
        
        // MENÚ
        
        System.out.println("A continuación vamos a implementar los distintos "
                + "\nmétodos de la clase IO_ES. Para ello vamos a elaborar un menú"
                + "\nque evite su ejecución en cascada, dejando a la persona que "
                + "\nejecuta el programa la elección.");
        System.out.println("----------------------------------------------");
        
        
        System.out.println("\nElige uno de los siguiente métodos.");
        System.out.println("\n1 -- leerInteger()"
                        + "\n2 -- leerReal()"
                        + "\n3 -- leerIntegerLargo()"
                        + "\n4 -- leerRealLargo()"
                        + "\n5 -- Salir del programa.");
        
        opcion = teclado.nextInt() ;
        
        // ----------- Llamadas a métodos --------------
        
        switch (opcion) //menú
                {
            case 1: //leerInteger - Int
                
                IO_ES.escribirLN("\nEl número introducido es: " + IO_ES.leerInteger());
                
                break;
                
            case 2: //leerReal - Float

                IO_ES.escribirLN("\nEl número introducido es: " + IO_ES.leerReal());
                
                break;
                
            case 3: //leerIntegerLargo - Long
                
                IO_ES.escribirLN("\nEl número introducido es: " + IO_ES.leerIntegerLargo());
                
                break;
                
            case 4: //leerRealLargo - Double
                
                IO_ES.escribirLN("\nEl número introducido es: " + IO_ES.leerRealLargo());
                
                break;
                
            default: // salir del programa
                
                IO_ES.escribir("¡Hasta luego, Manuela!");                
                
                break;
                
                }
        
    }
    
}
