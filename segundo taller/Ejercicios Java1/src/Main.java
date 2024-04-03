import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<String> frutas = new ArrayList<>();

        //Agregar Elementos Listas//

        frutas.add("Manzana");
        frutas.add("melon");
        frutas.add("naranja");
        frutas.add("uvas");
        frutas.add("Pera");

        //Buscar elementos//
        System.out.println(frutas.get(2));

        //tamaño//
        System.out.println("tamañano de la lista " + frutas.size()) ;

        //recorer el array//
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("la fruta es " + frutas.get(i) );
        }

        for (String i : frutas){
            System.out.println("-----" + i);
        }

        //editar Pocision//

        frutas.set(1, "Kiwi");

        for (String i : frutas){
            System.out.println(i);
        }

        //verificar si un elemento esta en la lista////

        boolean existe= frutas.contains("melon");
        if (existe){
            System.out.println("Se encontro el elemento");
        }else{
            System.out.println("No se encontro el elemento");
        }

        //eliminar la posicion de la lista//

        frutas.remove(0);
        for (String i : frutas){
            System.out.println(i);
        }

        //indice de posicion para eliminar//
        int ind = frutas.indexOf("melon");
        System.out.println(ind);
        if (ind >= 0){
            frutas.remove(ind);
            System.out.println(frutas);
            System.out.println("Fruta eliminada");
        }else{
            System.out.println("fruta no encontrada");
        }

        //Eliminar todos los elementos//

        frutas.clear();*/

        Scanner sc = new Scanner(System.in);
        /*int codigo, precio;
        String nombre, categotia;
        System.out.println("Digite el codigo de la fruta que quiere crear");
        codigo = sc.nextInt();
        System.out.println("Digite el precio de la fruta que quiere crear");
        precio = sc.nextInt();
        System.out.println("Digite el nombre de la fruta que quiere crear");
        nombre = sc.next();
        System.out.println("Digite la categoria de la fruta que quiere crear");
        categotia = sc.next();

        Fruta fruta = new Fruta(codigo,nombre, categotia, precio);*/
        ProcesoFruta gestion = new ProcesoFruta();
        gestion.Mostrarlista();
        System.out.println("Que categoria quiere buscar?");
        String buscar = sc.next();
        gestion.Buscar_CategoriaF(buscar);
    }
}