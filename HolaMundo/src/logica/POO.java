
package logica;


public class POO {

   
    public static void main(String[] args) {
    
    Alumno alu1 = new Alumno(); //llamo al constructor//
    Alumno alu2 = new Alumno(5,"Ivo","Pavicich");
    
        System.out.println("La id del alumno 2 es: "+ alu2.getId());
        System.out.println("el nombre es: "+ alu2.getNombre());
        System.out.println("el apellido es: "+ alu2.getApellido());
        
        alu1.setId(8);
        alu1.setNombre("Roque");
        alu1.setApellido("Perez");
        
        System.out.println("----------");
        System.out.println("La id del alumno 1 es: "+ alu1.getId());
        System.out.println("el nombre es: "+ alu1.getNombre());
        System.out.println("el apellido es: "+ alu1.getApellido());
        
        alu2.setId(35);
        System.out.println("----------");
         System.out.println("La id del alumno 2 es: "+ alu2.getId());
        System.out.println("el nombre es: "+ alu2.getNombre());
        System.out.println("el apellido es: "+ alu2.getApellido());
    }   
      
}
