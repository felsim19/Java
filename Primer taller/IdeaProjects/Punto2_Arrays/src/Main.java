import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Bienvenido usuario en este programa descubrira si las palabras son palindromos");
        String [] Palindromos = new String[1];
        System.out.println("Ingrese su palabra ");
        String palabra = Sc.next();
        int PL = 0;
        int UL = palabra.length() - 1;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(PL) == palabra.charAt(UL)){
                PL++;
                UL--;
            }else {
                System.out.println("La palabra no es palindroma");
                return;
            }
        }
        Palindromos[0] = palabra;
        System.out.println("La palabra es palindroma por lo tanto se puede subir al array");
        for (String x : Palindromos){
            System.out.println(x + " ");
        }
    }
}