import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienevenido usuario en este programa usted dara los resultados de cada corredor");
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Cuantos corredores haran la carrera?");
        int NumeroCorredores = Entrada.nextInt();
        int [] Tiempos = new int[NumeroCorredores];
        int mayor = 0;
        int menor = 1000;
        for (int i = 0; i<Tiempos.length; i++){
            System.out.println("ingrese el tiempo que se demoro haciendo la carrera");
            Tiempos[i] = Entrada.nextInt();
            if (mayor < Tiempos[i]){
                mayor = Tiempos[i];
            }
            if (menor > Tiempos[i]){
                menor = Tiempos[i];
            }
        }
        int [] Resultado = new int[3];
        Resultado[0] = Tiempos.length;
        Resultado[1] = menor;
        Resultado[2] = mayor;
        System.out.println("La cantidad de participantes es de " +  Resultado[0]);
        System.out.println("El corredor con menor tiempo fue de " + Resultado[1] + " Segundos");
        System.out.println("El corredor con mayor tiempo fue de " + Resultado[2] + " Segundos");
        System.out.print("Por lo tanto el array quedaria asi ");
        for (int x : Resultado){
            System.out.print(x + " ");
        }
    }
}