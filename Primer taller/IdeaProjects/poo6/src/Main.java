import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int longitud = 8;
        String Contraseña = "";
        Scanner Sc = new Scanner(System.in);
        password contraseña = new password(longitud, Contraseña);
        System.out.println("Bienvenido usuario, cuantas contraseña desea generar?");
        int cantidad = Sc.nextInt();
        String [] Seguridad = new String[cantidad];
        System.out.println("Que longitud desea poner (por defecto viene 8)?");
        contraseña.setLogintud(Sc.nextInt());
        for (int i = 0; i < Seguridad.length; i++) {
            Seguridad[i] = contraseña.generarPassword();
        }

        for(String x: Seguridad){
            System.out.println(x + " - esta contraseña es fuerte  - " + contraseña.esFuerte(x));
        }
    }
}