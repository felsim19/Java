import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Que datos desea llenar?");
            System.out.println("1.Persona 1");
            System.out.println("2.Persona 2");
            System.out.println("3.Persona 3");
            System.out.println("4.salir");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduce los datos para la primera persona:");
                    System.out.print("Nombre: ");
                    String nombre1 = sc.next();
                    System.out.print("Edad: ");
                    int edad1 = sc.nextInt();
                    System.out.print("Sexo (H/M): ");
                    char sexo1 = sc.next().charAt(0);
                    System.out.print("Peso: ");
                    float peso1 = sc.nextFloat();
                    System.out.print("Altura: ");
                    float altura1 = sc.nextFloat();
                    persona persona1 = new persona(nombre1, edad1, sexo1, peso1, altura1);
                    int estadoIMC1 = persona1.calcularimc();
                    System.out.println("Persona1 - Estado IMC: " + estadoIMC1);
                    System.out.println("Persona1 - Mayor de edad: " + persona1.esMayorDeEdad());
                    System.out.println("Persona1 - Información:\n" + persona1);
                break;
                case 2:
                    System.out.println("Introduce los datos para la segunda persona:");
                    System.out.print("Nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad2 = sc.nextInt();
                    System.out.print("Sexo (H/M): ");
                    char sexo2 = sc.next().charAt(0);
                    persona persona2 = new persona(nombre2, edad2, sexo2);
                    int estadoIMC2 = persona2.calcularimc();
                    System.out.println("\nPersona2 - Estado IMC: " + estadoIMC2);
                    System.out.println("Persona2 - Mayor de edad: " + persona2.esMayorDeEdad());
                    System.out.println("Persona2 - Información:\n" + persona2);
                break;
                case 3:
                    persona persona3 = new persona();
                    System.out.println("Introduce los datos para la tecera persona:");
                    System.out.print("Nombre: ");
                    persona3.setNombre(sc.next());
                    System.out.print("Edad: ");
                    persona3.setEdad(sc.nextInt());
                    System.out.print("Sexo (H/M): ");
                    persona3.setSexo(sc.next().charAt(0));
                    System.out.print("Peso: ");
                    persona3.setPeso(sc.nextFloat());
                    System.out.print("Altura: ");
                    persona3.setAltura(sc.nextFloat());
                    int estadoIMC3 = persona3.calcularimc();
                    System.out.println("\nPersona3 - Estado IMC: " + estadoIMC3);
                    System.out.println("Persona3 - Mayor de edad: " + persona3.esMayorDeEdad());
                    System.out.println("Persona3 - Información:\n" + persona3);
                    break;
                case 4:
                    System.out.println("Usted a salaido del programa vuelva pronto");
                    return;
            }
        }
    }
}