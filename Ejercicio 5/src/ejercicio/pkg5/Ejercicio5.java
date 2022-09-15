
package ejercicio.pkg5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        ArrayList<Persona> lista_persona = new ArrayList<>();
        
        lista_persona.add(new Persona("Wily", 19, 1002));
        lista_persona.add(new Persona("Mary", 19, 1003));
        lista_persona.add(new Persona("Oscar", 19, 1004));
        lista_persona.add(new Persona("Eric", 10, 1005));
        lista_persona.add(new Persona("Olmer", 22, 1006));
        
        for (Persona persona : lista_persona) {
            System.out.println("La lista tiene los sigunetes datos =>" +"Nombre: " +persona.nombre +" Edad: " +persona.edad 
                                + " Cedula: " +persona.cedula);
        }
        
        lista_persona.add(new Persona("Yenny", 34, 889));
        
        String N;
        
        System.out.print("Ingrese su Nombre: ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextLine();
        System.out.println("Se a guardado gracias " +N);
        
        lista_persona.clear();
        
        System.out.println(lista_persona.isEmpty());
        
    }
    
}
