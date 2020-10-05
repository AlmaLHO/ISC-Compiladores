package Compiladores;
import java.util.*;

public class Numero_Vocales {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Numero_Vocales obj = new Numero_Vocales();

        System.out.println("Ingrese oracion:");
        String oracion4 = dato.nextLine();
        obj.Funcion2(oracion4);

    }

    public void Funcion2(String cadena2) {

        int num = 0;
        for (int i = 0; i <= cadena2.length() - 1; i++) {

            char letra = cadena2.charAt(i);

            if (letra == 'a') {
                num++;
            }
            if (letra == 'e') {
                num++;
            }
            if (letra == 'i') {
                num++;
            }
            if (letra == 'o') {
                num++;
            }
            if (letra == 'u') {
                num++;
            }

        }

        System.out.println("\n" + "Contiene " + num + " vocales" + "\n");

    }
    
}