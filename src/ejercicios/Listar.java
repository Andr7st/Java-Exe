package ejercicios;
/**
 * @author Andrés Segura.
 *  
 * - Lista 
 */

class Listar {

    public void Run(){

}

    ///> Proporcionar una lista.
    public void titulos(){

        // Ejercicios
        Ejercicio_01 e01 = new Ejercicio_01();
        Ejercicio_02 e02 = new Ejercicio_02();
        // Imprimir lista en consola.
        System.out.printf("Ejercicio_%s.java \t %s \n", e01.NUMERO(), e01.TITULO());
        System.out.printf("Ejercicio_%s.java \t %s \n", e02.NUMERO(), e02.TITULO());

    }
}