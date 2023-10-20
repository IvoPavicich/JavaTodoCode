
package relaciones;
import java.util.ArrayList;
import java.util.List;
public class Relaciones {

   
    public static void main(String[] args) {
        
        Auto2 a1= new Auto2();
        a1.setId(1L);
        a1.setMarca("renault");
        a1.setModelo("duster");
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario> ();
        Propietario p1= new Propietario();
        Propietario p2= new Propietario();
        p1.setId(35L);
        p1.setNombre("Ivo");
        p1.setApellido("Pavi");
        
        p2.setId(36L);
        p2.setNombre("Iva");
        p2.setApellido("Sosa");
        
        listaPropietarios.add(p1);
        listaPropietarios.add(p2);
        
        a1.setListaPropietarios(listaPropietarios);
        System.out.println("el auto"+a1.getMarca()+" "+a1.getModelo()
                +"tiene como propietarios a "+ a1.getListaPropietarios().toString());
    }
    
}
