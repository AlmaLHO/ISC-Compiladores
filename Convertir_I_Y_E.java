package Compiladores;
import java.util.*;

public class Convertir_I_Y_E {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Convertir_I_Y_E obj = new Convertir_I_Y_E();

        System.out.println("Ingrese oracion:");
        String oracion = dato.nextLine();
        obj.Funcion1(oracion);

    }

    public void Funcion1(String cadena) {

        String extra = "owo";
        
        String palabra = cadena.replace("e", "we");
        String palabraF = palabra.replace("i", "wi").concat(extra);
        
        System.out.println("\n" + palabraF + "\n" );
   
    }

}