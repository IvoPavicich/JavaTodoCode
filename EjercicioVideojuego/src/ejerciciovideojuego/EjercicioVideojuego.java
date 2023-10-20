
package ejerciciovideojuego;
import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {

    public static void main(String[] args) {
        //creacion del arraylist
        List <VideoJuego> listaVideojuegos = new ArrayList <VideoJuego>();
        
        //creacion de los elementos del arraylist (intanciacion de objetos de la clase video juego)
        VideoJuego v1 = new VideoJuego(123,"Banjo kazooie","Nintendo 64",4,"Plataforma");
        VideoJuego v2 = new VideoJuego(456,"Mario Party 3","Nintendo 64",4,"Plataforma");
        VideoJuego v3 = new VideoJuego(789,"Age of Empire II"," Pc ",1,"Estrtegia");
        VideoJuego v4 = new VideoJuego(101,"Counter Strike 1.6"," Pc ",1,"Shooter");
        VideoJuego v5 = new VideoJuego(100,"Mario Kart","Nintendo 64",2,"Plataforma");
        //agregamos los objetos a la lista
        listaVideojuegos.add(v1);
        listaVideojuegos.add(v2);
        listaVideojuegos.add(v3);
        listaVideojuegos.add(v4);
        listaVideojuegos.add(v5);
        

        //Recorremos la lista
        for(VideoJuego video:listaVideojuegos){
            System.out.println("Titulo :" + video.getTitulo()+ "; Consola :"+video.getConsola()+
                                "; Cantidad de Jugadores :"+video.getCantJugadores());      
        }
        //cambio de nombre y jugadores al azar
        v1.setTitulo("Banjo Kazooie 2");
        v1.setCantJugadores(2);
        
        v5.setTitulo("Super Mario Kart 64");
        v5.setCantJugadores(6);
        
        //recorrer la lista y mostrar solo elementos que son de Nintendo 64
        System.out.println("--------------------------------------------");
        for (VideoJuego video : listaVideojuegos) {
            if (video.getConsola().equals("Nintendo 64")) {
                System.out.println(video.toString());
            }
        }
        
    }
    
}
