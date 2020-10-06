package ejercicios;
/**
 * @author Andrés Segura.
 * @author Andr7st
 * - Practicas de programación en Java.
 */
public class Ejercicio_04 {
    // 'while'
    // - Hacer un incremento con una tarea repetitiva simple.

    public void Run(){
        
        // Imprimir los números del 1 al 20 (pocas líneas de código).

        System.out.println("Numeros del 1 al 10:");

        int i=0;
        while (i<20) {
            System.out.println("numeros - " + (i+1));
            i++;
        }

        System.out.println();
    }
}
