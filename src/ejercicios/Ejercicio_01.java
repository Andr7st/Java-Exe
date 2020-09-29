package ejercicios;
/**
 * @author Andrés Segura.
 * 
 *   EJERCICIO:
 * - Varias formas de imprimir datos en consola.
 * - Usos de secuencias de escape.
 */

class Ejercicio_01 { 
    ///> INFORMACIÓN DEL EJERCICIO ACTUAL:
    /**
     * - Todas las clases numeradas tendrán esto:
     * 
     * Agregar un titulo y una breve descripción de lo que hace lo que se programa 
     * en cada clase para poder consultarlo desde el programa compilado.
     */

    ///> Poner el nombre del fichero java donde se encuentra el ejercicio, seguido del titulo
    private String ejercicio = "Ejercicio_001.java \t Imprimiendo Datos";
    private String descripcion = "";
    public String titulo(){ return ejercicio; }

    public String descripcion(){
        descripcion = "Hacer esto..";
        return descripcion;
    }

    public void detalles(){
        descripcion  = "Consta de simplemente imprimir datos en consola," 
        + "\nel objetivo de esto es revisar el código interno \nde programación.";
        ///> Porque así Qué chiste.
        String separador = "------------------------------------------------------";
        System.out.println(separador);
        System.out.printf("%s \t\t %s \n", "ARCHIVO", "TITULO");
        System.out.println(ejercicio);
        System.out.println("\nDESCRIPCION:");
        System.out.println(descripcion);
        System.out.println(separador + "\n");
    }


    public void Run(){
        ///> Imprimir:
        System.out.print("IMPRIMIR ");
        System.out.print("EN ");
        System.out.print("CONSOLA ");
        ///> Imprimir con saltos:
        System.out.println(); // Salto vacío.
        System.out.println("¡Hola, que tal!");
        ///> CARÁCTERES DE ESCAPE:
        /*
        char caracter1 = '\n'; //> Nueva Linea
        char caracter2 = '\t'; //> Tabulador
        char caracter3 = '\r'; //> Retroceso de Carro.
        char caracter4 = '\f'; //> Comienzo de Pagina.
        char caracter5 = '\b'; //> Borrado a la Izquierda.
        char caracter6 = '\\'; //> El carácter barra inversa.
        char caracter7 = '\''; //> El carácter prima simple.
        char caracter8 = '\"'; //> El carácter prima doble.
        */ 
        System.out.println();
        System.out.println("USANDO SECUENCIAS DE ESCAPE:");
        System.out.println("Mandando a \nNueva linea.");
        System.out.println("Haciendo una \tTAbulacion");
        System.out.println("Haciendo un \rRetrocediendo."); //> No apareceá el contenido antes del retroceso.
        System.out.println("Hola Mundo\b Hola Mundo"); //> Borra el caracter anterior, lo cambia por espacio.
        System.out.println("Barra invertida: \\Temp\\Archivo.txt"); //>
        System.out.println("Prima simple: I\'m learning how program.");
        System.out.println();
        ///> IMPRESIÓN CON FORMATO:
        System.out.println("IMPRESION CON FORMATO:");
        System.out.printf("Mi nombre es: %s%n", "Andres");

    }
}