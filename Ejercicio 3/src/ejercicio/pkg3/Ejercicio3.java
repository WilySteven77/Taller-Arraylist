
package ejercicio.pkg3;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        
        ArrayList<Integer> pares = new ArrayList<>();
        
        int i = 0, n;
        
        for (int j = 2; j <= 20; j+=2) {
            
            pares.add(j);
            i++;
        }
        System.out.println(pares);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("El array tiene: " +pares.size() + " posiciones");
        System.out.println("Introdusca que posicion desea eliminar ");                                     
        System.out.println("Numero: ");
        n = sc.nextInt();
        
        
        pares.remove(n);
        System.out.println(pares);
    }

    
    
}
