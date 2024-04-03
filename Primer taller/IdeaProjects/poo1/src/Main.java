import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ponga la nueva marca");
        String marca = Sc.nextLine();
        System.out.println("Ponga la nueva placa");
        String placa = Sc.nextLine();
        System.out.println("Ponga el nuevo color");
        String color = Sc.nextLine();
        System.out.println("Ponga el modelo");
        int modelo = Sc.nextInt();
        Vehiculos micarro = new Vehiculos(marca, placa, color, modelo);
        micarro.setMarca(Sc.next());
        micarro.getMarca();
        System.out.println("La marca de su vehiculo es " + micarro.getMarca());
        System.out.println("La placa de su vehiculo es " + micarro.placa);
        System.out.println("el color de su vehiculo es " + micarro.color);
        System.out.println("El modelo del vehiculo es" + micarro.getModelo());
        System.out.println("Su velocidad es de " + micarro.velocidad);
        System.out.println("Su estado es de " + micarro.estado);
        micarro.Arrancar();
        System.out.println("Su velocidad es de " + micarro.velocidad);
        System.out.println("Su estado es de " + micarro.estado);
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Arrancar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Acelerar();
        micarro.Frenar();
        micarro.Frenar();
        micarro.Frenar();
        micarro.Frenar();
        micarro.Detener();
        micarro.Frenar();
        micarro.Frenar();
        micarro.Frenar();
        micarro.Frenar();
        micarro.Frenar();
        micarro.Frenar();
        micarro.Detener();
        micarro.Arrancar();
    }
}