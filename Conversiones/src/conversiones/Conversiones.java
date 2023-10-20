
package conversiones;

public class Conversiones {

    public static void main(String[] args) {
       double num = 1.54;
       //casteo a int 
       int numInt=(int) num;
       //casteo a long
       long numLong=(long) num;
        System.out.println("DOUBLE "+ num);
        System.out.println("INT "+numInt);
        System.out.println("LONG "+ numLong);
    ///////////////////////////////////////////////////////////////////
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("String es una clase no un tipo de dato primitivo x eso tiene sus metodos !!!!!!");
        String cantidad = "15";
        String precio = "150.27";
        //PARSEO
        int cantEntero = Integer.parseInt(cantidad) ;
        double precioDouble = Double.parseDouble(precio);
        System.out.println("El valor total es : " + (cantEntero*precioDouble));
    /////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------------------------------------");
       System.out.println("CONVERSION A STRING");
       int edad=30;
       double estatura = 1.67;
       String edadString= String.valueOf(edad);
       String estaturaString = String.valueOf(estatura);
        System.out.println("Edad "+ edadString + "Estatura "+ estaturaString);
    }
    
}
 