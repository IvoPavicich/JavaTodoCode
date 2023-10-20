
package vector;

import java.util.Scanner;

public class Vector {
    
    public static void main(String[] args) {
        int [] vector= new int[15];
        Scanner teclado = new Scanner(System.in);
        for(int i=0;i<vector.length;i++){
            System.out.println("Ingrese un numero para el vector");
            vector[i]=teclado.nextInt();
        
        }
        int n3=0;
        for(int i=0;i<vector.length;i++){
            if(vector[i] == 3){
               n3++;
        }
            
        }
        
        System.out.println("La cantidad de Numeros 3 ingresados es = "+ n3);
        
        
        
        
    }
    
}
