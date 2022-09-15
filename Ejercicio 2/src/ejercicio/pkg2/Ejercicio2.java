
package ejercicio.pkg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        int n;
  
        do {
            System.out.println("Introduce números enteros. 0 para acabar: ");                                     
            System.out.println("Numero: ");
            n = sc.nextInt();
            if (n != 0){
                numeros.add(n);
            }
        }while (n != 0);
       
        System.out.println("Has ingresado " + numeros.size() + " números:");
        
        System.out.println("El array contiene: " +numeros);

        double suma = 0;
        for(Integer i: numeros){
            suma = suma + i;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + suma/numeros.size());
    }
    
}
