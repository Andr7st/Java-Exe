package ejercicios;
/**
 * @author Andrés Segura.
 * @author Andr7st
 * - Practicas de programación en Java.
 */
import java.util.Scanner;

public class Ejercicio_03 {
    // 'if'
    public void Run(){

        Scanner entrada = new Scanner(System.in); // No cerrar - don't close. 

        int num1, num2;

        System.out.println("Introdcir dos números Int y devolver el mayor: ");

        System.out.print("Introduce valor 1: ");
        num1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Introduce valor 2: ");
        num2 = Integer.parseInt(entrada.nextLine());
        
        // Uso
        if(num1 > num2){
            System.out.println("El " + num1 + " es el mayor.");
        }
        else if(num1 < num2){
            System.out.println("El " + num2 + " es el mayor.");
        }
        else{
            System.out.println(num1 + " = " + num2 + ", son iguales.");
        }
        System.out.println();
    }
}
