
package arraylistvslinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    
    public static void main(String[] args) {

        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Ivo", 33));
        listaArray.add(new Persona(2, "Jorge", 30));
        listaArray.add(new Persona(3, "Luisa", 29));
        listaArray.add(new Persona(4, "Juana", 30));

        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "Ivo", 33));
        listaLinked.add(new Persona(2, "Jorge", 30));
        listaLinked.add(new Persona(3, "Luisa", 29));
        listaLinked.add(new Persona(4, "Juana", 30));

        //Remove en ArrayList;pasamos el índice
        listaArray.remove(2);

        //Remove en LinkedList;pasamos el elemento
        String nomBorrar = "Jorge";//poedemos ingresar por teclado
        for (Persona p2 : listaLinked) {
            if (p2.getNombre().equals(nomBorrar)) {
                listaLinked.remove(p2);
                break;//corta la ejecucion
            }
        }
        
        //RECORRIDO
        System.out.println("------DESPUES DE ELIMINAR------");
        System.out.println("-----------------------------");
        System.out.println("------ARRAYLIST--------- ");
        for (Persona p : listaArray) {
            System.out.println("prueba" + p.getNombre());
        }
        System.out.println("------LINKEDLIST--------- ");
        for (Persona p : listaLinked) {
            System.out.println("prueba" + p.getNombre());
        }
        
        //tamaño de la lista (ArrayList y LinkedList)
        System.out.println("----tamaño de las lista?");
        System.out.println("ArrayList: "+listaArray.size());
        System.out.println("LinkedList :"+listaLinked.size());
        
        //Obtener el 1er y ultimo elemento de la lista 
        System.out.println("------Primer y ultimo elemento de la lista (SOLO PARA LINKEDLIST!!!!!!---------)");
        System.out.println("el primer elemento es :"+ listaLinked.getFirst().toString());
        System.out.println("el ultimo elemento es :"+ listaLinked.getLast().toString());
        
        //Borrar toda la lista (ambas)
        System.out.println("-----Borrando LISTA-------");
        listaArray.clear();
        listaLinked.clear();
        
        //comprobar si esta vacia
        System.out.println("-------Esta vacia alguna de las listas???--------");
        System.out.println("ArrayList: "+ listaArray.isEmpty());
        System.out.println("listaLinked: "+ listaLinked.isEmpty());
    }
    
}
