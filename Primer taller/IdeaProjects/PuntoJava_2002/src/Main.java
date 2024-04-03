import java.util.Random;
import java.util.Scanner;

public class Main {
    public String GenerarContraseña (int lenght){
        String Abecedario_minuscula = "abcdefghijklmnopqrstuvwxyz";
        String Abecedario_Mayuscula = Abecedario_minuscula.toUpperCase();
        String Numeros = "0123456789";

        String Caracteres = Abecedario_minuscula + Abecedario_Mayuscula + Numeros;

        Random Nrandom = new Random();

        String Resultado = "";

        for (int i = 0; i < lenght; i++) {
            int Posicion = Nrandom.nextInt(Caracteres.length());
            char Caracter = Caracteres.charAt(Posicion);
            Resultado += Caracter;
        }
        return Resultado;
    }
    public boolean ValidarContraseña(String contraseña){
        int contadorNumeros = 0;
        int contadorMinusculas = 0;
        int contadorMayusculas = 0;

        for (char caracter : contraseña.toCharArray()) {
            if (Character.isDigit(caracter)) {
                contadorNumeros++;
            } else if (Character.isLowerCase(caracter)) {
                contadorMinusculas++;
            } else if (Character.isUpperCase(caracter)) {
                contadorMayusculas++;
            }
        }
        return contadorNumeros >= 6 && contadorMinusculas >= 2 && contadorMayusculas >= 2;
    }

    public static void main(String[] args) {
        Main GeneradorC = new Main();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Bienvenido usuario este programa generara ccontraseñas");
        System.out.println("Cuantas Contraseñas desea generar?");
        int Cantidad_Contraseña = Sc.nextInt();
        String [] Contraseñas = new String[Cantidad_Contraseña];
        System.out.println("De cuanto indice desea las contraseñas?");
        int Indice_Contraseñas = Sc.nextInt();
        if (Indice_Contraseñas < 8) {
            System.out.println("La contraseña no puede ser menor a 8");
            return;
        }else {
            for (int i = 0; i < Contraseñas.length; i++) {
                Contraseñas[i] = GeneradorC.GenerarContraseña(Indice_Contraseñas);
            }
        }
        for (String contraseña: Contraseñas){
            System.out.println(contraseña + " - Cumple con requisitos: " + GeneradorC.ValidarContraseña(contraseña));
        }
    }
}