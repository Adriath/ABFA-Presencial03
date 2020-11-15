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
        
        /* ------------------ NOTAS: 
        
            Ya que el enunciado no especifica el método exacto de
            implementación, me he tomado la libertar de hacer un menú para la 
            ocasión. Aquí quedan implementados los métodos que devuelven datos y
            con ellos los métodos escribir() y escribirLN(). En primer momento
            pensé indicarlo con un texto por pantalla y luego escribir la
            invocación con algún mensaje de prueba, luego se me ocurrió esta forma
            para que todo esté relacionado y los métodos interactúen entre sí.
            
            Aclaro esto para que no pase desapercibido, y si había alguna manera
            específica de hacerlo no he sido capaz de descifrarla.
        
            Las instrucciones Try/Catch las he metido en el main por una razón:
            los métodos, al devolver valores y tener una instrucción return me
            obligaba a darle un valor a la variable. Tal y como tengo hecho el
            menú iba a mostrar un valor, si hay algún error se mostrará el valor
            con el que inicié la variable, algo que quedaba muy feote. Tomé la 
            decisión de hacerlo dentro del menú para que no ocurriera, sin embargo,
            ahora hay que salir al menú cada vez que se inserta algún dato erróneo.
        */
        
        
        //Declaración de variables
        
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        
        // MENÚ
        
        System.out.println("A continuación vamos a implementar los distintos "
                + "\nmétodos de la clase IO_ES. Para ello vamos a elaborar un menú"
                + "\nque evite su ejecución en cascada, dejando a la persona que "
                + "\nejecuta el programa la elección.");
        System.out.println("----------------------------------------------");
        
        
        do
        {
            
            try
            {

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

                    try
                    {
                        IO_ES.escribirLN("\nEl número introducido es: " + IO_ES.leerInteger());
                    }
                    catch(InputMismatchException e){
                        System.err.println("¯\\_(ツ)_/¯ Has introducido una letra o un número no válido.");
                        teclado.nextLine();
                    }
                    catch(Exception e){
                        System.err.println("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.");
                        teclado.nextLine();
                    }

                    break;

                case 2: //leerReal - Float

                    try
                    {
                        IO_ES.escribirLN("\nEl número introducido es: " + IO_ES.leerReal());
                    }
                    catch(InputMismatchException e){
                        System.err.println("¯\\_(ツ)_/¯ Has introducido una letra o un número no válido.");
                        teclado.nextLine();
                    }
                    catch(Exception e){
                        System.err.println("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.");
                        teclado.nextLine();
                    }

                    break;

                case 3: //leerIntegerLargo - Long

                    try
                    {
                        IO_ES.escribirLN("\nEl número introducido es: " + IO_ES.leerIntegerLargo());
                    }
                    catch(InputMismatchException e){
                        System.err.println("¯\\_(ツ)_/¯ Has introducido una letra o un número no válido.");
                        teclado.nextLine();
                    }
                    catch(Exception e){
                        System.err.println("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.");
                        teclado.nextLine();
                    }

                    break;

                case 4: //leerRealLargo - Double

                    try
                    {
                        IO_ES.escribirLN("\nEl número introducido es: " + IO_ES.leerRealLargo());
                    }
                    catch(InputMismatchException e){
                        System.err.println("¯\\_(ツ)_/¯ Has introducido una letra o un número no válido.");
                        teclado.nextLine();
                    }
                    catch(Exception e){
                        System.err.println("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.");
                        teclado.nextLine();
                    }

                    break;

                case 5: // salir del programa

                    IO_ES.escribir("\n¡Hasta luego, Manuela! \n");

                    break;

                default: // Opción incorrecta

                    IO_ES.escribir("\nIntroduce una opción válida, por favor. \n\n-----------------\n");

                    break;

                    }
                }
            catch(InputMismatchException e){
                System.err.println("(╯‵□′)╯︵┻━┻ ¿Se puede saber qué has introducido? No es tan difícil, un número del 1 al 5.");
                teclado.nextLine();
            }
            catch(Exception e){
                System.err.println("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.");
                teclado.nextLine();
            }
            
        } while (opcion != 5);
        
    }
    
}
