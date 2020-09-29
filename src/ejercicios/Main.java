package ejercicios;

import java.util.Scanner;

/**
 * @author Andrés Segura - Ejercicios de programación java Java.
 * 
 * 
 */

public class Main {
    public static void main(String[] args) {

        Listar lista = new Listar();


        Consola consola = new Consola();
        Ejercicio_01 $e001 = new Ejercicio_01();
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu seleccion: ");
        String datoIngresado = entrada.nextLine();
        entrada.close();

        ////> En caso de ingresar una palabra clave "LISTAR", mostrar la lista
        ////> el archivo que contiene el ejercicio, seguido del titulo que le he puesto.
        ////> * Los que aparecen en la lista son los que están acomodados en el archivo de nombre 'Listar.java'
        ////> * Despues de listar, se cerrará el programa.

        if (datoIngresado.equalsIgnoreCase("listar")){
            lista.titulos();
            System.exit(0);
        }

        int casoEvaluar = 0; //> se inicializa para que el _switch no marque error.

        //> Tratar de convertir el dato que se ha ingresado su valor numeríco.
        try {
            casoEvaluar = Integer.parseInt(datoIngresado);
        } catch (Exception e) {
            ///System.out.println(e);
            System.out.println("No valido.");
            System.out.println(e + "\nDebes ingresar un número entero.");
            //main(args);
            //System.exit(0);
        }

        switch (casoEvaluar) {
            case 1:

            consola.setColor("Yellow", "");
            $e001.detalles();
            consola.ClearColor();

            $e001.Run(); //> Todos se ejecutarán desde el -.Run()

                break;
        
            default:
            System.out.println("Numero no comprendido.");
                break;
        }
    }
}











/* 

*/