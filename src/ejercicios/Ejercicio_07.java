package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */
public class Ejercicio_07 { 

    /// Caracteres ANSI
    public void Run(){
        /**
         * Imprimir caracteres ANSI y su número de código.
         * - Usando distintos 'while', 'do while' y 'for'
         */
        System.out.println("Caracteres ANSI");
        System.out.println("American National Standards Institute.\n");

        final String forma1 = "do while";
        final String forma2 = "while";
        final String forma3 = "for";
        String formaDeEjecutar = forma1;

        if(formaDeEjecutar.equalsIgnoreCase(forma1)){
            // Usando el ciclo 'while'.
            int i=33;
            while (i<256) {
                char caracterANSI = (char)i;
                System.out.printf("chr(%d) = %c %n", i, caracterANSI);
                i++;
            }
        }
        if(formaDeEjecutar.equalsIgnoreCase(forma2)){
            // Usando el ciclo 'do_while'.
            int i=33;
            do{
                char caracterANSI = (char)i;
                System.out.printf("chr(%d) = %c %n", i, caracterANSI);
                i++;
            }while(i<256);
            
        }
        if(formaDeEjecutar.equalsIgnoreCase(forma3)){
            // Usando el ciclo 'for'.
            // - Es el ciclo que por general es más usado por los programadores, en lenguajes como; python es diferente su forma.
            for(int i=33; i<256; i++){
    
                char caracterANSI = (char)i;

                System.out.printf("chr(%d) = %c %n", i, caracterANSI);
            }
        }
        //
    }
}