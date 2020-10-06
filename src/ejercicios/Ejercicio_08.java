package ejercicios;

public class Ejercicio_08 {

       // Algunos caracteres unicode.
       public void Run(){

        System.out.println("Algunos carácteres impresos con código unicode:\n");
        // Vocales minúsculas con tilde.
        char acentosMinus[] = new char[5];
        acentosMinus[0] = '\u00E1'; // á
        acentosMinus[1] = '\u00E9'; // é
        acentosMinus[2] = '\u00ED'; // í
        acentosMinus[3] = '\u00F3'; // ó
        acentosMinus[4] = '\u00FA'; // ú
        // Vocales mayúsculas con tilde.
        char acentosMayus[] = new char[5];
        acentosMayus[0] = '\u00C1'; // Á
        acentosMayus[1] = '\u00C9'; // É
        acentosMayus[2] = '\u00CD'; // Í
        acentosMayus[3] = '\u00D3'; // Ó
        acentosMayus[4] = '\u00DA'; // Ú

        // Minusculas.
        System.out.println("Minúsculas:");
        for (int i=0; i<5; i++){
            System.out.println("vocal: " + acentosMinus[i]);
        }
        
        System.out.println("\nMayúsculas:");
        // Mayúsculas.
        for (int i=0; i<5; i++){
            System.out.println("VOCAL: "+ acentosMayus[i]);
        }
        
    }
    
}
