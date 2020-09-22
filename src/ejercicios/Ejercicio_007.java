package ejercicios;
/**
 * @author Andrés Segura
 * - **while**
 * - Ejercicio de adivinar el número que estoy pensando.
 * - Sin uso de acentos o carácteres especiales en el programa.
 */

import java.util.Scanner;

class AdivinaNumeroV1{

    //public AdivinaNumeroV1(){}

    public void Run(){
        
        //// El sistema generará un numero aleatorio, el cual debes adivinar.
        int numeroAdivinar = (int)(Math.floor(Math.random() * 100));
        
        Scanner entrada = new Scanner(System.in); // Por convención se llama "entrada" o "scanner" en minúscula.
        
        int i = 0; //> Conteo - por convención.
        
        while (true) {//Condición siempre cierta.
            
            i++;
            
            System.out.print("Adivina el numero que estoy pensando: ");
            int numeroIngresado = entrada.nextInt();
            
            if(numeroIngresado < numeroAdivinar){
                System.out.println("Ingresa un numero mayor.");
            }
            if(numeroIngresado > numeroAdivinar){
                System.out.println("Ingresa un numero menor.");
            }
            if(numeroIngresado == numeroAdivinar){
                System.out.println("\n¡Es correcto! \nEl numero es " + numeroAdivinar + ", lo intentaste " + i + " veces!!!");
            }
            
            if (numeroIngresado==numeroAdivinar) { break;}
        }

        entrada.close();        
    }
}