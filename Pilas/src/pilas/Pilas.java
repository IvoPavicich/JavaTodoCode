
package pilas;

import java.util.Stack;

public class Pilas {
    
    public static void main(String[] args) {
       Stack<Integer> pila = new Stack<Integer>();  
        System.out.println("Pila vacia "+ pila);
        System.out.println("Esta vacia ?"+ pila.isEmpty());
        
        //Agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        for( Integer pilita:pila){
            System.out.println(pilita); 
        }
        
        //Mostrar
        System.out.println("Pila vacia "+ pila);
        System.out.println("Esta vacia? "+ pila.isEmpty());  
       
        pila.pop();//elimana el ultimo elemento que ingreso a la pila
        System.out.println("Esta el elemento 3 ?"+ pila.search(3));
        System.out.println("Ultimo agregado "+ pila.peek());
    }
    
}
