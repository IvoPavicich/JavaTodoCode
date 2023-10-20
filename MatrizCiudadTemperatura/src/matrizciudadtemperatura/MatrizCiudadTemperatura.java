
package matrizciudadtemperatura;

import java.util.Scanner;


public class MatrizCiudadTemperatura {

   
    public static void main(String[] args) {
       String ciudades[]= new String[3]; 
       Double minimas[]= new Double[3];
       Double maximas[]= new Double[3];
       Scanner nc= new Scanner(System.in);
       Scanner nt= new Scanner(System.in);
        
    for(int i=0;i<ciudades.length;i++){
        System.out.println("Ingrese el nombre de la ciudad");
        ciudades[i]=nc.next();
        System.out.println("Ingrese la temperatura Minima");
        minimas[i]=nt.nextDouble();
        System.out.println("Ingrese la temperatura Maxima");
        maximas[i]=nt.nextDouble();
    
    }
    Double minima=9999999.00;
    int posMin= -1;
    Double maxima= -9999999.00;
    int posMax= -1;
    for(int i=0;i<ciudades.length;i++){
    
        if(minimas[i] < minima){
            minima=minimas[i];
            posMin = i;
        }
        if(maximas[i] > maxima){
            maxima= maximas[i];
            posMax = i;
        }
    
    }
        System.out.println("La temperatura minima es :"+ minima);
        System.out.println("En la ciudad "+ ciudades[posMin]);
        System.out.println("La temperatura Maxima es : "+ maxima);
        System.out.println("En la ciudad "+ ciudades[posMax]);
    
    }
    
    
}
