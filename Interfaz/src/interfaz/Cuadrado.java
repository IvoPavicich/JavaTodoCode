
package interfaz;

public class Cuadrado implements Figura, Dibujable {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

   
    
    @Override
    public double calcularArea() {
        double resul= lado* lado;
        return resul;
    }

    @Override
    public void dibujar() {
        System.out.println("hola estoy dibujando");
    }
}
