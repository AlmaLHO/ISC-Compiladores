package Compiladores;
import java.util.*;

public class LetrasIdenticas {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        LetrasIdenticas obj = new LetrasIdenticas();
        
        System.out.println("Ingrese palabra:");
        String palabra = dato.next();
        obj.Funcion3(palabra);

    }
    
    public static void Funcion3(String cadena3) {
       
        char palabra [] = cadena3.toCharArray();
       
        for(int i = 0; i<=palabra.length;i++){
          if ((i+1)<(palabra.length-1)){
              if(palabra[i] == palabra[i+1]){
                  System.out.println("\n" + true + " : Verdadero - La palabra tiene 2 letras identicas" + "\n"); 
              }
          }   
       }
    }

}
