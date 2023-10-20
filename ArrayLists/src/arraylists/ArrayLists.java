
package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        
    List<Persona> lista= new ArrayList<Persona>();
    /*otra manera de instanciar un objeto y agregarlo a la lista
    Persona per= new Persona(num,nombre,edad);
      lista.add(per);
    */
    lista.add(new Persona(1,"Ivo",33));
    lista.add(new Persona(2,"Jorge",30));
    lista.add(new Persona(3,"Luisa",29));
    lista.add(new Persona(4,"Juana",30));
    
    /*RECORRIDO por indice uso FOR*/
    System.out.println("------------FOR------------------");
    for(int i= 0; i<lista.size();i++){
        System.out.println("Prueba"+ lista.get(i).getNombre());
    }
    /*RECORRIDO elemento por elemento FOREACH*/
    System.out.println("------------FOREACH------------------");
    for(Persona p:lista){
        System.out.println("Prueba"+ p.getNombre());
    }
    }
    
}
