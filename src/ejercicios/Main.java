package ejercicios;
import andr7st.Consola;
import java.util.Scanner;
/**
 * @author Andr7st
 * @author Andrés Segura - Ejercicios Java. 
 */
public class Main {
    public static void main(String[] args) {

        Consola consola = new Consola(); /// Mi librería.

        Metodo metodo = new Metodo();   

        String clave; // Almacena lo escrito en la consola.
        int numClave; // lo escrito en consola en caso de ser un número.

       
        consola.ponerColorFrente("amarillo");

        /// Ingreso de datos.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce numero de ejercicio: ");
        clave = entrada.nextLine();
        entrada.close();

        /**
         * PALABRAS CLAVE:
         * - En caso de ingresar una palabra clave se ejecutará la instrucción definida
         *   y luego se cerrará.
         * 
         * - Si se ingresa algún String no contemplado; avisa y cerrará.
         */

        try {
            metodo.palabrasClave(clave);
            //ingresasteNumero = false;
        } catch (Exception e) {}

        /**
         * NUMERO:
         * - En caso de ingresar un número, intenta ejecutarlo, de lo contrario se cierra.
         */

        if(metodo.metodoClave == false){ // <-- 
            try {
                numClave = Integer.parseInt(clave);
                metodo.ejecutar(numClave);
                
            } catch (Exception e) {
                System.out.println("Salir"); // main(args); // Habilitar al final
            }
        }

        System.gc();
        System.exit(0);
    }
}




class Metodo{
    //
    public void ejecutar(int numEjercicio){
        /// ejercicios validos.
        Ejercicio_01 e01 = new Ejercicio_01();
        Ejercicio_02 e02 = new Ejercicio_02();
        ///
        switch (numEjercicio) {
            case 1: e01.Run(); break;
            case 2: e02.Run(); break;

        default:
        System.out.println("Eleccion no listada.");
        break;
        }
    }


    // Mostrar algunas descripciones.
    public void palabrasClave(String palabraClave){ // todavia sin usar.

        Listar lista = new Listar();

        if(palabraClave.equalsIgnoreCase("ayuda") || palabraClave.equalsIgnoreCase("help")){
            // PONER UNA AYUDA
            System.out.println("Ejercicio");
            this.metodoClave = true;
        }

        else if (palabraClave.equalsIgnoreCase("listar")){
            lista.titulos();
            this.metodoClave = true;
        }
    }

    boolean metodoClave = false;
    public boolean MetodoClave(){return metodoClave;}






    public void titulos(){

        // Ejercicios
        Ejercicio_01 e01 = new Ejercicio_01();
        Ejercicio_02 e02 = new Ejercicio_02();
        // Imprimir lista en consola.
        System.out.printf("Ejercicio_%s.java \t %s \n", e01.NUMERO(), e01.TITULO());
        System.out.printf("Ejercicio_%s.java \t %s \n", e02.NUMERO(), e02.TITULO());

    }
}