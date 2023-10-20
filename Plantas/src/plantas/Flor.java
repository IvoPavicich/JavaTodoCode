
package plantas;


public class Flor extends Planta{

    private String colorPetalos;
    private double cantPetalos;
    private String colorPistilos;
    private String variedad;
    private String estacion;

    public Flor() {
    }

    public Flor(String colorPetalos, double cantPetalos, String colorPistilos, String variedad, String estacion, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistilos = colorPistilos;
        this.variedad = variedad;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(double cantPetalos) {
        this.cantPetalos = cantPetalos;
    }

    public String getColorPistilos() {
        return colorPistilos;
    }

    public void setColorPistilos(String colorPistilos) {
        this.colorPistilos = colorPistilos;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
    
    
    
    
    
    
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, Soy una Flor");
    }
    
}
