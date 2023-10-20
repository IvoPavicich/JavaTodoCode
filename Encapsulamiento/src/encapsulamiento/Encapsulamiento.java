
package encapsulamiento;


public class Encapsulamiento {

    
    public static void main(String[] args) {
        Alumno alu= new Alumno();
        Alumno alu2= new Alumno(12,"hhaf","sagg");
        alu.setId(1);
        alu.setNombre("Ivo");
        alu.setApellido("Pavi");
        System.out.println(""+alu.getId()+" "+alu.getNombre()+" "+alu.getApellido());
        
        
        
        
    }
    
}
