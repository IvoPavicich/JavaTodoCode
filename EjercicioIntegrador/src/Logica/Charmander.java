
package Logica;

public class Charmander extends Pokemon implements IFuego  {

    public Charmander() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Charmander este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Charmander este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Charmander este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
         System.out.println("Hola Charmander este es mi ataque punio de fuego");
    }

    @Override
    public void atacarLanzarllamas() {
         System.out.println("Hola Charmander este es mi ataque lanzar llamas");
    }

    @Override
    public void atacarAscuas() {
         System.out.println("Hola Charmander este es mi ataque ascuas");
    }
}
