
package ejerciciosnivel01;

import java.util.Arrays;

/**
 *
 * @author Miren Diosa Puta Ama
 */
public class EjerciciosNivel01 {
    
    //declaramos el array 
    int [] listaNumeros = {50, 31, 27, 5, 99};
    
    //De una lista te va a devolver la más alta. Se usa el ARRAY
    //Ejercicio Prueba
    public int maximo( int [] lista) {
        //declaramos un int auxiliar para que al principio la lista empiece en la posición 0
        int auxiliar = lista[0];
        for (int i=0; i < lista.length; i++) { 
            if (auxiliar < lista[i]) {
                auxiliar = lista[i];
            }
        }
        return auxiliar;
    }
    
    //Ejercicio 1: queremos sacar los dos máximos de la lista.
    public int[] maximos (int [] lista) {
        
        int [] arrayMaximos = {lista[0],lista[0]};
        
        for (int i=0; i < lista.length; i++) { //para que compare el primer valor, y si supera el inicial, que guarde el inicial en el segundo valor
          if (arrayMaximos[0] < lista[i]) {
              arrayMaximos[1] = arrayMaximos[0];
              arrayMaximos[0] = lista[i];
          }
          else if (arrayMaximos[1] < lista[i]) {//para que busque si el segundo valor que hemos cambiado, hay otro que sea mayor
              arrayMaximos[1] = lista[i];
          }
        }
        return arrayMaximos;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01 ejercicio = new EjerciciosNivel01();
        
            //Ejercicio Prueba
        System.out.println("Máximo ListaNumeros: " + ejercicio.maximo(ejercicio.listaNumeros));
        
            //Ejercicio 1
        System.out.println("ArrayMaximos: " + Arrays.toString(ejercicio.maximos(ejercicio.listaNumeros)));
    }
    
}
