import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Hola , Usuario");
        System.out.println("Digite su Nombre: ");
        String nombre;
        nombre = Entrada.next();
        System.out.println("Digite su Apellido: ");
        String apellido;
        apellido = Entrada.next();
        System.out.println("Digite Su Edad");
        int edad;
        edad = Entrada.nextInt();
        int descuentoEdad;
        if (edad >= 15 && edad <= 18){
            descuentoEdad = 25;
            System.out.println("Su Descuento es del : " + descuentoEdad + "%");
        }else if(edad >= 19 && edad <= 21){
            descuentoEdad = 15;
            System.out.println("Su Descuento es del : " + descuentoEdad + "%");
        } else if (edad >= 22 && edad <= 25) {
            descuentoEdad = 10;
            System.out.println("Su Descuento es del : " + descuentoEdad + "%");
        }else {
            descuentoEdad = 0;
            System.out.println("Su Descuento es del : " + descuentoEdad + "%");
        }
        System.out.println("Digite Su Puntaje en el examen");
        int puntaje;
        puntaje = Entrada.nextInt();
        int descuentoPuntaje;
        if (puntaje >= 80 && puntaje < 86){
            descuentoPuntaje = 30;
            System.out.println("Su Descuento es del : " + descuentoPuntaje + "%");
        } else if (puntaje >= 86 && puntaje < 91) {
            descuentoPuntaje = 35;
            System.out.println("Su Descuento es del : " + descuentoPuntaje + "%");
        } else if (puntaje >= 91 && puntaje < 96) {
            descuentoPuntaje = 40;
            System.out.println("Su Descuento es del : " + descuentoPuntaje + "%");
        } else if (puntaje >= 96 && puntaje <= 100 ) {
            descuentoPuntaje = 45;
            System.out.println("Su Descuento es del : " + descuentoPuntaje + "%");
        } else {
            descuentoPuntaje = 0;
            System.out.println("Su Descuento es del : " + descuentoPuntaje + "%");
        }
        System.out.println("Digite el Numero Decimal De Salarios Minimos Mensuales");
        float salarios;
        salarios = Entrada.nextFloat();
        int descuentoSalarios;
        if (salarios > 0 && salarios <= 1){
            descuentoSalarios = 30;
            System.out.println("Su Descuento es del : " + descuentoSalarios + "%");
        } else if (salarios > 1 && salarios <=2) {
            descuentoSalarios = 20;
            System.out.println("Su Descuento es del : " + descuentoSalarios + "%");
        } else if (salarios > 2 && salarios <=3) {
            descuentoSalarios = 10;
            System.out.println("Su Descuento es del : " + descuentoSalarios + "%");
        }else if (salarios > 3 && salarios <=4){
            descuentoSalarios = 5;
            System.out.println("Su Descuento es del : " + descuentoSalarios + "%");
        }else{
            descuentoSalarios = 0;
            System.out.println("Su Descuento es del : " + descuentoSalarios + "%");
        }
        int descuentoTotal = descuentoEdad + descuentoPuntaje + descuentoSalarios;
        System.out.println("Usuario : " + nombre + " " + apellido);
        System.out.println("Su descuento total sobre la matricula es del : " + descuentoTotal + "%");
    }
}