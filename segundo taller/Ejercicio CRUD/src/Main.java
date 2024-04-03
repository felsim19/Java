import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido Al bar mas chimba que hay!!!");
        int precio;
        String nombre, color, categoria;
        procesolicor gestion = new procesolicor();
        menuuno: while (true){
            System.out.println("Puede elegir cualquiera de las siguientes opciones");
            System.out.println("1.Entar como administrador");
            System.out.println("2.Entar como cliente");
            System.out.println("3.Salir");
            int opcion1 = sc.nextInt();
            sc.nextLine();
            switch (opcion1){
                case 1:
                    menudos: while (true) {
                        System.out.println("1.Mostra Inventario");
                        System.out.println("2.Agregar bebida");
                        System.out.println("3.modificar bebida");
                        System.out.println("4.Buscar bebida por nombre");
                        System.out.println("5.Buscar bebida por categoria");
                        System.out.println("6.elimiar bebida");
                        System.out.println("7.Salir");
                        int opcion2 = sc.nextInt();
                        switch (opcion2) {
                            case 1:
                                gestion.MostrarLista();
                                break;
                            case 2:
                                System.out.println("Digite el nombre de la bebida que va a agregar");
                                nombre = sc.next().toUpperCase();
                                System.out.println("Digite el precio de la bebida que va a agregar");
                                precio = sc.nextInt();
                                System.out.println("Digite el categoria de la bebida que va a agregar");
                                categoria = sc.next().toUpperCase();
                                System.out.println("Digite el color de la bebidia que va a agregar");
                                color = sc.next().toUpperCase();
                                licor l = new licor(nombre, precio, categoria, color);
                                gestion.Agregarlicor(l);
                                break;
                            case 3:
                                System.out.println("Digite el nombre del objeto que va a editar");
                                String editar = sc.next().toUpperCase();
                                gestion.EditarLicor(editar);
                                break;
                            case 4:
                                System.out.println("Digite el nombre del licor que va a buscar");
                                String busquedaN = sc.next();
                                gestion.Bucar_Nombre(busquedaN);
                                break;
                            case 5:
                                System.out.println("Digite la cetegoria del licor que va a buscar");
                                String busquedaC = sc.next();
                                gestion.Bucar_Categoria(busquedaC);
                                break;
                            case 6:
                                System.out.println("Digite el nombre del producto que quiere elimiar");
                                String eliminar = sc.next().toUpperCase();
                                gestion.Eliminarlicor(eliminar);
                                break;
                            case 7:
                                System.out.println("Hasta luego administrador vuele pronto");
                                break menudos;
                            default:
                                System.out.println("Ingrese un numero valido");
                        }
                    }
                 break;
                case 2:
                    menutres: while (true){
                        System.out.println("1.consultar menu");
                        System.out.println("2.Pedir producto");
                        System.out.println("3.Facturar");
                        System.out.println("4.salir");
                        int opcion3 = sc.nextInt();

                        switch (opcion3){
                            case 1:
                                gestion.MostrarLista();
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre del producto que desea pedir");
                                String buscar = sc.next().toUpperCase();
                                gestion.Buscar_Venta(buscar);
                                break;
                            case 3:
                                System.out.println("Bien, el total de la facturacion de todos los productos es de " + gestion.getValorTotal());
                                break;
                            case 4:
                                System.out.println("Hasta luego cliente vuele pronto");
                                break menutres;
                            default:
                                System.out.println("Ingrese una opcion valida");
                        }
                    }
                 break;
                case 3:
                    System.out.println("Gracias por visitar nuestro bar vuelve pronto");
                    break menuuno;
                default:
                    System.out.println("Ingrese un pocion valida");
                break;
            }
        }
    }
}
 