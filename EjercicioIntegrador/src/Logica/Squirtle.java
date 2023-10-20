
package Logica;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Squirtle este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Squirtle este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Squirtle este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola Squirtle este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola Squirtle este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola Squirtle este es mi ataque pistola de agua");
    }
}
