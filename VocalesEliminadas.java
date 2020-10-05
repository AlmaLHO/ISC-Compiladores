package Compiladores;
import java.util.*;

public class VocalesEliminadas {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        VocalesEliminadas obj = new VocalesEliminadas();

        System.out.println("Ingrese oracion:");
        String oracion4 = dato.nextLine();
        obj.Funcion4(oracion4);

    }

    public void Funcion4(String cadena4) {

        String palabra1 = cadena4.replace("a", "");
        String palabra2 = palabra1.replace("e", "");
        String palabra3 = palabra2.replace("i", "");
        String palabra4 = palabra3.replace("o", "");
        String palabra5 = palabra4.replace("u", "");
        String palabraF = palabra5.replace(" ", "");

        System.out.println("\n" + palabraF);

    }
    
}
