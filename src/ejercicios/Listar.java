package ejercicios;
/**
 * @author Andrés Segura.
 *  
 * - Aquí es donde trato de hacer una lista de los ejercicios de programación java. 
 */
class Listar {

    private final String autor = "Andrés Segura.";

    public void Run(){

        /**
         * LISTAR LOS EJERCICIOS:
         * Para obtener el nombre de cada ejercicio, todos tentrán un getter y así obtener 
         * el nombre de archivo y del ejercicio.
         * 
         * Se hace de esta forma porque es más eficiente y sobre todo mucho menos 
         * tedioso que estar copiandolos aqui, teniendo en cuenta que es 
         * posible cambiar un ejercicio a un archivo diferente.
         * 
         * Esta lista sirve para una busqueda más sencilla.
         * 
        */
        
        /* 
        print
        Scanner
        
        if
        if-else
        if-else_if

        while
        while-do

        for
        for-each

        switch
        */
    }

    ///> Proporcionar una lista de todos los titulos:
    public void titulos(){
        ////>
        Ejercicio_01 e001 = new Ejercicio_01();
        Ejercicio_02 e002 = new Ejercicio_02();
        Ejercicio_03 e003 = new Ejercicio_03();
        
        String ejercicios = e001.titulo(); 
        ejercicios+= "\n" + e002.titulo();
        ejercicios+= "\n" + e003.titulo();
        
        System.out.printf("%s \t\t %s \n", "ARCHIVO", "TITULO");
        System.out.println(ejercicios + "\n\n" + autor);

    }
    
}
