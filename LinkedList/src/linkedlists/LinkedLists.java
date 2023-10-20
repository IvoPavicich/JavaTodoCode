
package linkedlists;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        
    List<Persona> lista = new LinkedList <Persona>(); 
    /*otra manera de instanciar un objeto y agregarlo a la lista
    Persona per= new Persona(num,nombre,edad);
      lista.add(per);
    */
    //agregar personas al final de la lista
    lista.add(new Persona(1,"Ivo",33));
    lista.add(new Persona(2,"Jorge",30));
    lista.add(new Persona(3,"Luisa",29));
    lista.add(new Persona(4,"Juana",30));
    
    //agregar al principio
   lista.add(0,new Persona(0,"Ivana",27 ));
    /*RECORRIDO elemento por elemento FOREACH*/
    System.out.println("------------FOREACH------------------");
    for(Persona p:lista){
        System.out.println("Prueba"+ p.getNombre());
    }
    }
    
}