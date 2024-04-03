import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Bienvenido a la magica Tienda de Postres");
        int OpcionA, OpcionB;
        int Acomulador = 0;
        int Precio = 0;
        int Unidades =0;
        do{
            System.out.println("Ingrese una opcion");
            System.out.println("1 = Mostar Menu");
            System.out.println("2 = Cuenta");
            System.out.println("3 = Pagar");
            OpcionA = Entrada.nextInt();
            switch (OpcionA){
                case 1:
                    do{
                        System.out.println("1.Pastel de chocolate ($6000)");
                        System.out.println("2.Helado de vainilla ($3500)");
                        System.out.println("3.Galleta de Avena ($2500)");
                        System.out.println("4.Salir");
                        OpcionB = Entrada.nextInt();
                        switch (OpcionB){
                            case 1:
                                System.out.println("Haz comprado un pastel de chocolate($6000)");
                                System.out.println("Cuantas unidades deseas llevar?");
                                Unidades = Entrada.nextInt();
                                Precio = 6000 * Unidades;
                                System.out.println("Esto Cuesta $" + Precio);
                                Acomulador += Precio;
                                break;
                            case 2:
                                System.out.println("Haz comprado un Helado de vainilla ($3500)");
                                System.out.println("Cuantas unidades deseas llevar?");
                                Unidades = Entrada.nextInt();
                                Precio = 3500 * Unidades;
                                System.out.println("Esto Cuesta $" + Precio);
                                Acomulador += Precio;
                                break;
                            case 3:
                                System.out.println("Haz comprado un Galleta de Avena ($2500)");
                                System.out.println("Cuantas unidades deseas llevar?");
                                Unidades = Entrada.nextInt();
                                Precio = 2500 * Unidades;
                                System.out.println("Esto Cuesta $" + Precio);
                                Acomulador += Precio;
                                break;
                            default:
                                System.out.println("Ingrese una opcion Correcta");
                        }
                    }while (OpcionB != 4);
                    break;
                case 2:
                    System.out.println("Usuario su cuenta total fue de $"+Acomulador);
                break;
                case 3:
                    System.out.println("Gracias por pagar, Vuelva pronto");
                    break;
            }
        }while (OpcionA != 3);
    }
}