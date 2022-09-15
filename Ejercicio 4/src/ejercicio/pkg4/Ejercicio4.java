
package ejercicio.pkg4;

import java.util.ArrayList;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        
        ArrayList<Integer> objetos = new ArrayList<>();
        
        objetos.add(10);
        objetos.add(20);
        objetos.add(30);
        objetos.add(40);
        objetos.add(50);
        objetos.add(60);
        System.out.println("El array contine: " +objetos);
        
        objetos.add(1, 1000);
        objetos.add(3, 2000);
        System.out.println("El nuevo array tiene: "+objetos);
        
        objetos.set(0, 5000);
        objetos.set(2, 10000);
        System.out.println("utilizado el set, el array tiene: "+objetos);
        
        System.out.println("La primera ocurrencia del numero 2000 es: " +objetos.indexOf(2000));
        System.out.println("La primera ocurrencia del numero 2000 es: " +objetos.lastIndexOf(2000));
        
        objetos.add(2000);
        System.out.println("2. La primera ocurrencia del numero 2000 es: " +objetos.indexOf(2000));
        System.out.println("2. La primera ocurrencia del numero 2000 es: " +objetos.lastIndexOf(2000));
        
        System.out.println("El valor 40 se encuentra en el array: " +objetos.contains(40));
        
        if(objetos.contains(40) == true){
            System.out.println("El numero 40 esta en la posicon: " +objetos.indexOf(40));
        }
        objetos.remove(5);
        System.out.println("El array contine: " +objetos);
        
        System.out.println(objetos.isEmpty() + " Y tiene " +objetos.size() +" elemntos");
        
        ArrayList<Integer> b = new ArrayList<>();
        
        b.add(111);
        b.add(222);
        b.add(333);
        System.out.println("El array b contiene: " +b);
        
        ArrayList<Integer> c = new ArrayList<>();
        c.add(77777);
        c.add(88888);
        System.out.println("El array c contiene: " +c);
        
        
        b.addAll(c);
        b.addAll(objetos);
        
        System.out.println("El array b contiene: " +b);
        objetos.add(99999);
        
        System.out.println("El array contine: " +objetos);
        
        b.removeAll(objetos);
        System.out.println("El array b contiene: " +b);
        System.out.println("El array contine: " +objetos);
        
        objetos.clear();
        System.out.println(objetos.isEmpty());
    }
    
}
