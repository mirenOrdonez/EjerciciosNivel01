
package ejerciciosnivel01;

import java.util.Arrays;

/**
 *
 * @author Miren Diosa Puta Ama
 */
public class EjerciciosNivel01 {
    
    //EJERCICIO 1: MÁXIMOS.     
    
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
    
    //EJERCICIO 2: PALÍNDROMOS. 
    
    public boolean palindromo (String cadena) {
        cadena = cadena.toUpperCase(); //Lo ponemos todo en mayúsculas para que no haya errores a la hora de comparar. 
        //Suponemos que el String no tiene tildes.
        //Para quitar los espacios. 
        cadena = quita(cadena);
        //declaramos dos variables, una que sea para la posición inicial y otro para la final. 
        int izq = 0;
        int der = cadena.length() - 1;
        
        //Vamos a hacer que la posición de la izquierda vaya creciendo y la de la derecha decreciendo;
        // y comparando el valor correspondiente a ambas variables. 
        while ((izq <= der) && cadena.charAt(izq) == cadena.charAt(der)) {
            izq++; //iremos aumentando el valor de la izquierda. 
            der--; //lo iremos decreciendo. 
        }
        if (izq > der) { //si la posición de la izq es mayor que la de der, será que son palíndromos. 
            return true;
        }
        else {
            return false;
        }
         
    }
        //Para quitar los espacios
        private String quita(String frase){
            String auxiliar = "";
            for (int i=0; i<frase.length(); i++){
                if (frase.charAt(i) != ' '){
                    auxiliar = auxiliar + frase.charAt(i);
                }
            }
            return auxiliar;
        }
    
        
        //EJERCICIO 3: ISOGRAMA.
    
    public boolean isograma (String cadena) {
        cadena = cadena.toUpperCase();
        cadena = quita(cadena);
        
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = i+1; j < cadena.length(); j++) {
               if (cadena.charAt(i) == cadena.charAt(j)) {
                   return false;
               }
            }
        }
        return true;
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
        
            //Ejercicio 2
        System.out.println("Palíndromos: " + ejercicio.palindromo("amoroma"));
        System.out.println("Palíndromos: " + ejercicio.palindromo("ligar es ser ágil"));
        System.out.println("Palíndromos: " + ejercicio.palindromo("acaso hubo buhos aca"));
        
            //Ejercicio 3
        System.out.println("Isograma: " + ejercicio.isograma("amor"));
        System.out.println("Isograma: " + ejercicio.isograma("murcielago"));
        System.out.println("Isograma: " + ejercicio.isograma("pollo"));
    }
    
}
