import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bienvenido este programa es para el bus");
        Scanner Sc = new Scanner(System.in);
        String placa = "";
        int cantidadPasajeros = 0;
        double precioPasaje = 0;
        int pasajerosActuales = 0;
        int pasajerosAdicionales = 0;
        bus ManejarBus = new bus(placa, cantidadPasajeros, precioPasaje, pasajerosActuales, pasajerosAdicionales);
        System.out.println("Digite la placa del bus");
        ManejarBus.setPlaca(Sc.nextLine());
        System.out.println("Digite el valor del pasaje");
        ManejarBus.setPrecioPasaje(Sc.nextDouble());
        System.out.println("Digite la cantiad maxima del bus");
        ManejarBus.setCantidadPasajeros(Sc.nextInt());
        System.out.println("Digite el numero de pasajeros que se encuentra en el bus");
        ManejarBus.setPasajerosActuales(Sc.nextInt());
        System.out.println("La cantidad maxima de pasajero es de " + ManejarBus.getCantidadPasajeros());
        System.out.println("La placa del bus es " + ManejarBus.getPlaca());
        System.out.println("La precio de pasaje del bus es " + ManejarBus.getPrecioPasaje());

        while (ManejarBus.getPasajerosActuales() >= 0){
            System.out.println("Usted acabo de iniciar el viaje ");
            System.out.println("La cantidad de pasajeros actual es de " + ManejarBus.getPasajerosActuales());
            System.out.println("Usted puede 1.Subir Pasajeros o 2.Bajar pasajeros o 3.Dinero Total o 4.salir");
            int opcion = Sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Digite la capacidad de pasajeros que se van a subir en el bus ");
                    ManejarBus.setPasajerosAdicionales(Sc.nextInt());
                    ManejarBus.SubirPasajeros();
                break;
                case 2:
                    System.out.println("Digite la capacidad de pasajeros que se van a bajar del bus ");
                    ManejarBus.setPasajerosAdicionales(Sc.nextInt());
                    ManejarBus.BajarPasajeros();
                break;
                case 3:
                    ManejarBus.getTotalPasajeros();
                break;
                case 4:
                    System.out.println("Usted a salido del programa");
                return;
            }
        }
    }
}