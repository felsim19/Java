import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 5, 4, 2};
        int mayor = 0;
        int suma = 0;
        System.out.println(numbers[5]);
        System.out.println(Arrays.toString(numbers));

        //Utilizando el for en java//
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]);
            suma += numbers[i];
        }
        System.out.println();
        System.out.println(suma);

        //Utilizando el foreach en java//
        for (int j : numbers) {
            System.out.println(j);
        }

        String names[] = new String[5];
        names[2] = "mateochupon";

        Scanner Entrada = new Scanner(System.in);

        for (int i = 0; i < names.length ; i++) {
            names[i] = Entrada.nextLine();
        }

        for (String n : names){
            System.out.print(n + " ");

        }
    }
}