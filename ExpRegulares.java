package estructura_datos2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class ExpRegulares{

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ExpRegulares x = new ExpRegulares();
        
        System.out.println("1.- busca_3a \n");
        System.out.println(x.busca_3a("mañana"));
        System.out.println(x.busca_3a("banana"));
        System.out.println(x.busca_3a("canada"));
        System.out.println(x.busca_3a("canana"));
        System.out.println(x.busca_3a("campeche"));
        System.out.println(x.busca_3a("Esto e"));
//------------------------------------------------------------------------------      
        String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";
// Lo siguiente devuelve true
        System.out.println("2.- validar fecha númerica \n");
        System.out.println(Pattern.matches(regexp, "11/12/2014"));
        System.out.println(Pattern.matches(regexp, "1/12/2014"));
        System.out.println(Pattern.matches(regexp, "11/2/2014"));
// Los siguientes devuelven false
        System.out.println(Pattern.matches(regexp, "11/12/14")); // El año no tiene cuatro cifras
        System.out.println(Pattern.matches(regexp, "11//2014")); // el mes no tiene una o dos cifras
        System.out.println(Pattern.matches(regexp, "11/12/14perico")); // Sobra "perico"
//------------------------------------------------------------------------------
        String literalMonthRegexp = "\\d{1,2}/()(ene|feb|mar|abr|may|jun|jul|ago|sep|oct|nov|dic)/\\d{4}";
// Lo siguiente devuelve true
        System.out.println("3.- validar fecha con mes tipo caracter \n");
        System.out.println(Pattern.matches(literalMonthRegexp, "11/dic/2014"));
        System.out.println(Pattern.matches(literalMonthRegexp, "1/nov/2014"));
        System.out.println(Pattern.matches(literalMonthRegexp, "1/AGO/2014")); // Mes en mayúsculas
        System.out.println(Pattern.matches(literalMonthRegexp, "21/Oct/2014")); // Primera letra del mes en mayúsculas.
// Los siguientes devuelven false
        System.out.println(Pattern.matches(literalMonthRegexp, "11/abc/2014")); // abc no es un mes
        System.out.println(Pattern.matches(literalMonthRegexp, "11//2014")); // falta el mes
        System.out.println(Pattern.matches(literalMonthRegexp, "11/jul/2014perico")); // sobra perico
//------------------------------------------------------------------------------
        System.out.println("4.- validaNumeroEnteroPositivo_Exp \n");
        System.out.println("ingresa dato");
        String dato = scanner.nextLine();
        System.out.println(x.validaNumeroEnteroPositivo_Exp(dato));
//------------------------------------------------------------------------------
        System.out.println("5.- validaNumeroEnteroNegativo_Exp \n");
        System.out.println("ingresa dato");
        String dato2 = scanner.nextLine();
        System.out.println(x.validaNumeroEnteroNegativo_Exp(dato2));
//------------------------------------------------------------------------------
        System.out.println("6.- validaNumeroEntero_Exp \n");
        System.out.println("ingresa dato");
        String dato3 = scanner.nextLine();
        System.out.println(x.validaNumeroEntero_Exp(dato3));
//------------------------------------------------------------------------------
        System.out.println("7.- Validar una matrícula europea 9999AAA y la de la UAC al999999 \n");
        System.out.println("ingresa dato");
        String dato4 = scanner.nextLine();
        System.out.println(x.validarMatriculaEuropea_Exp(dato4));

        System.out.println("ingresa dato");
        String dato5 = scanner.nextLine();
        System.out.println(x.validarMatriculaUAC_Exp(dato5));
//------------------------------------------------------------------------------
        System.out.println("8.- Validar un número binario \n");         
        System.out.println("ingresa dato");
        String dato6 = scanner.nextLine();
        System.out.println(x.validaBinario_Exp(dato6));
//------------------------------------------------------------------------------
        System.out.println("9.- Valida un nombre de usuario en twitter, empieza por @ y puede contener letras mayusculas y minusculas, numeros, guiones y guiones bajos, de 15 caracteres de longitud. \n");
        System.out.println("ingresa dato");
        String dato7 = scanner.nextLine();
        System.out.println(x.validarUsuarioTwitter_Exp(dato7));
//------------------------------------------------------------------------------
        System.out.println("10.- Expresión regular para DNI\n");
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]" ;
        // Lo siguiente devuelve true
        System.out.println(Pattern.matches(dniRegexp, "01234567C" ));
        // Lo siguiente devuelve faslse
        System.out.println(Pattern.matches(dniRegexp, "01234567U" )); // La U no es válida
        System.out.println(Pattern.matches(dniRegexp, "0123567X")); // No tiene 8 cifras
//------------------------------------------------------------------------------        
        System.out.println("11.- Expresión regular para email \n");       
        String emailRegexp = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
        // Lo siguiente devuelve true
        System.out.println(Pattern.matches(emailRegexp, "a@b.com"));
        System.out.println(Pattern.matches(emailRegexp, "+++@+++.com"));
        // Lo siguiente devuelve faslse
        System.out.println(Pattern.matches(emailRegexp, "@b.com")); // Falta el nombre
        System.out.println(Pattern.matches(emailRegexp, "a@b.c")); // El dominio final debe tener al menos dos letras
        
    }
//------------------------------------------------------------------------------
    public static boolean busca_3a(String cadena) {
        String expR = ".[aA].[aA].[aA]";
        Pattern pat = Pattern.compile(expR);
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }
//------------------------------------------------------------------------------
    public static boolean validaNumeroEnteroPositivo_Exp(String texto) {
        return texto.matches("^[0-9]+$");
    }

    public static boolean validaNumeroEnteroNegativo_Exp(String texto) {
        return texto.matches("^-[0-9]+$");
    }

    public static boolean validaNumeroEntero_Exp(String texto) {
        return texto.matches("^-?[0-9]+$");
    }

    public static boolean validarMatriculaEuropea_Exp(String matricula) {
        return matricula.matches("^[0-9]{4}[A-Z]{3}$");
    }
    
    public static boolean validarMatriculaUAC_Exp(String matricula) {
        return matricula.matches("^[a-z]{2}[0-9]{6}$");
    }

    public static boolean validaBinario_Exp(String binario) {
        return binario.matches("^[0-1]+$");
    }

    public static boolean validarUsuarioTwitter_Exp(String usuario_twitter) {
        return usuario_twitter.matches("^@([A-Za-z0-9_]{1,15})$");
    }
 


}