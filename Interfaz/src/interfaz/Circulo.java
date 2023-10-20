
package interfaz;

public class Circulo implements Figura, Dibujable, Rotable{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    

            
    /*Alt + Enter*/ 
    @Override
    public double calcularArea(){
        double pi=3.14;
        double resul= pi* radio * radio;
        return resul;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("hola estoy rotando un circulo");
    }
    
}
