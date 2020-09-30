package ejercicios;
/**
 * @author Andrés Segura.
 * 
 * - Varias formas de imprimir datos en consola.
 * - Usos de secuencias de escape.
 */

class Ejercicio_01 { 

    //// Poner algo para idendificarlo desde la consola en caso de necesitarlo en el futuro.
    private String Numero = "01"; /// Debe ser String.
    private String Titulo = "Imprimir"; 
    private String Descripcion;
    ////
    public String NUMERO(){return Numero;}
    public String TITULO(){return Titulo;}
    public String DESCRIPCION(){
        Descripcion  = "";
        Descripcion += "Imprimiendo con nueva linea y secuencias de escape.";
        return Descripcion;
    }

    public void Run(){
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

        /// Mostrar lista en consola.
        System.out.println("LISTA DE SECUENCIAS DE ESCAPE:");
        /// Mostrar una lista de secuencias de escape;
        String secuenciasEscape = "";
        secuenciasEscape += "\\n \tNueva Linea";
        secuenciasEscape += "\n\\t \tTabulador";
        secuenciasEscape += "\n\\r \tRetroceso de carro";
        secuenciasEscape += "\n\\f \tComienzo de pagina";
        secuenciasEscape += "\n\\b \tBorrado hacia la izquierda.";
        secuenciasEscape += "\n\\\\ \tBarra inversa";
        secuenciasEscape += "\n\\' \tComilla simple";
        secuenciasEscape += "\n\\\" \tComilla doble";
        /// print.
        System.out.println(secuenciasEscape);
        System.out.println();



        System.out.print("IMPRIMIR ");
        System.out.print("EN ");
        System.out.print("CONSOLA ");
        ///> Imprimir con saltos:
        System.out.println(); // Salto vacío.
        System.out.println("¡Hola, que tal!");
        ///> CARÁCTERES DE ESCAPE:
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