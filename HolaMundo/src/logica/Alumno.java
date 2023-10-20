
package logica;

//private,public =>modificadores de acceso//
public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        /*propio de la clase*/
        this.id = id;/*lo que recibe*/
        this.nombre = nombre;
        this.apellido = apellido;
    }
    /*getter y setters => Metodo especiales que permiten 
      los valores de cada atributo que tenenmos de un clase
    */
    public int getId() {/*traer*/
        return id;
    }

    public void setId(int id) {/*poner,modoficar o establecer valores*/
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public void mostranNombre(){ 
        System.out.println("hola soy un alumno y se decir mi nombre");
    }
    
    
}   
