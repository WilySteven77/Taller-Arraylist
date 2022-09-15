
package ejercicio.pkg1;

import java.util.ArrayList;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        
        ArrayList <String> nombre = new ArrayList();
        nombre.add("William");
        nombre.add("Eric");
        nombre.add("Mary");
        nombre.add("Juan");
        nombre.add("Yenny");
        
        System.out.println("El array contiene: " +nombre);
        
        nombre.add(1, "Oscar");
        nombre.remove(0);
        nombre.add(0, "Juli");
        System.out.println("El array modificado contiene: " +nombre);
        System.out.println("En nombre de la posicion 1 es: " +nombre.get(1));
        System.out.println("El ultimo nombre del array esta en la posicion " +nombre.indexOf("Yenny") + 
                " y tiene como nombre " +nombre.get(5));
        
    }
    
}
