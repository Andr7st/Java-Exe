package ejercicios;
/**
 * @author Andrés Segura.
 * @author Andr7st
 * - Practica de programación en Java.
 */
public class Ejercicio_01 {
    /**
     * - Imprimiendo datos en consola.
     * - Uso de secuencias de escape.
     */

    public void Run(){

        String rayas = "--------------------------------";

        /*
        LAS SECUENCIAS DE ESCAPE:
        char| \n - Nueva Linea
        char| \t - Tabulador
        char| \r - Retroceso de Carro.
        char| \f - Comienzo de Pagina.
        char| \b - Borrado a la Izquierda.
        char| \\ - El carácter barra inversa.
        char| \' - El carácter prima simple.
        char| \" - El carácter prima doble.
        */ 

        //// Mostrando la lista de secuencias de escape en la consola.
        System.out.println(rayas);
        System.out.println("LISTA DE SECUENCIAS DE ESCAPE:\n");
        String secuenciasEscape = "";

        secuenciasEscape += "\\n \tNueva Linea";
        secuenciasEscape += "\n\\t \tTabulador";
        secuenciasEscape += "\n\\r \tRetroceso de carro";
        secuenciasEscape += "\n\\f \tComienzo de pagina";
        secuenciasEscape += "\n\\b \tBorrado hacia la izquierda.";
        secuenciasEscape += "\n\\\\ \tBarra inversa";
        secuenciasEscape += "\n\\' \tComilla simple";
        secuenciasEscape += "\n\\\" \tComilla doble";
        
        System.out.println(secuenciasEscape);
        //System.out.print("IMPRIMIR ");
        //System.out.print("EN ");
        //System.out.print("CONSOLA ");
        ///> Imprimir con saltos:
        //System.out.println(); // Salto vacío.
        //System.out.println("¡Hola, que tal!");


        ///> CARÁCTERES DE ESCAPE:
        System.out.println(rayas);
        System.out.println("USANDO SECUENCIAS DE ESCAPE:\n");
        System.out.println("Mandando a \nNueva linea.");
        System.out.println("Haciendo una \tTAbulacion");
        System.out.println("Haciendo un \rRetrocediendo."); //> No apareceá el contenido antes del retroceso.
        System.out.println("Hola Mundo\b Hola Mundo"); //> Borra el caracter anterior, lo cambia por espacio.
        System.out.println("Barra invertida: \\Temp\\Archivo.txt"); //>
        System.out.println("Prima simple: I\'m learning how program.");


        ///> IMPRESIÓN CON FORMATO:
        System.out.println(rayas);
        System.out.println("IMPRESION CON FORMATO:\n");
        System.out.printf("Mi nombre es: %s%n", "Andres");
        System.out.println();


    }
}