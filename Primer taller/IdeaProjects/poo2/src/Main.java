import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bienvenido este programa le dara una cita medica");
        Scanner Sc = new Scanner(System.in);
        int numero = 0;
        int tipo = 0;
        double tarifa = 0;
        cita CitaMedica = new cita(numero,tipo,tarifa);
        System.out.println("Digite su numero ");
        CitaMedica.setNumero(Sc.nextInt());
        System.out.println("Digite el tipo ");
        CitaMedica.setTipo(Sc.nextInt());
        System.out.println("Digite la tarifa ");
        CitaMedica.setTarifa(Sc.nextInt());
        System.out.println("El numero de la cita es " + CitaMedica.getNumero());
        System.out.println("Esta cita es de tipo " + CitaMedica.getTipo());
        System.out.println("Su tarifa normal es  " + CitaMedica.getTarifa());
        System.out.println("Pero por ser de tipo " + CitaMedica.getTipo() + " queda con un valor final de " + CitaMedica.getValorFinal());
    }
}