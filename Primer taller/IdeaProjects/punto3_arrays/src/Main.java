import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número desde la entrada estándar
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Almacenar cada dígito en un arreglo
        int longitud = (int) Math.log10(numero) + 1;
        int[] digitos = new int[longitud];

        for (int i = longitud - 1; i >= 0; i--) {
            digitos[i] = numero % 10;
            numero /= 10;
        }

        // Mostrar resultados
        System.out.println("Cantidad de dígitos: " + digitos.length);

        // Calcular y mostrar la suma de dígitos
        int suma = 0;
        for (int digito : digitos) {
            suma += digito;
        }
        System.out.println("Suma de dígitos: " + suma);

        // Calcular y mostrar el producto de dígitos
        int producto = 1;
        for (int digito : digitos) {
            producto *= digito;
        }
        System.out.println("Producto de dígitos: " + producto);

        // Mostrar el dígito más a la izquierda
        System.out.println("Dígito más a la izquierda: " + digitos[0]);

        // Mostrar el dígito más a la derecha
        System.out.println("Dígito más a la derecha: " + digitos[digitos.length - 1]);

        // Encontrar y mostrar el dígito menor
        int minimo = digitos[0];
        for (int digito : digitos) {
            if (digito < minimo) {
                minimo = digito;
            }
        }
        System.out.println("Dígito menor: " + minimo);

        // Encontrar y mostrar el dígito mayor
        int maximo = digitos[0];
        for (int digito : digitos) {
            if (digito > maximo) {
                maximo = digito;
            }
        }
        System.out.println("Dígito mayor: " + maximo);

        // Invertir el número y mostrarlo
        int invertido = 0;
        for (int i = 0; i < digitos.length; i++) {
            invertido = invertido * 10 + digitos[i];
        }
        System.out.println("Número invertido: " + invertido);
    }
}
