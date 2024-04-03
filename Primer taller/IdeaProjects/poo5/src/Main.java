import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String numero = "";
        String tipo = "";
        double ValorInicial = 0;
        double monto = 0;
        cuenta CuentaB = new cuenta(numero, tipo, ValorInicial);
        System.out.println("Bienvenido usuario Este programa creara su cuenta");
        System.out.println("Digite el numero de la cuenta");
        CuentaB.setNumero(Sc.next());
        System.out.println("Digite el tipo solo puede ser ahorro o credito");
        CuentaB.setTipo(Sc.next());
        System.out.println("Digite el valor incial de la cuenta");
        CuentaB.setSaldoActual(Sc.nextDouble());
        while (true){
            System.out.println("Que desea hacer 1.le permite conseginar o 2. le permite retirar");
            System.out.println("Que desea hacer 3.le permite consultar el saldo o 4. le permite consultar el saldo minimo");
            System.out.println("Que desea hacer 5.le permite consultar la capacidad de credito 6.le permite salir");
            int opcion = Sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuanto desea Conseguirnar?");
                    monto = Sc.nextDouble();
                    CuentaB.consignar(monto);
                break;
                case 2:
                    System.out.println("Cuanto desea retirar?");
                    monto = Sc.nextDouble();
                    CuentaB.retirar(monto);
                break;
                case 3:
                    System.out.println("Su saldo actual es de " + CuentaB.getSaldoActual());
                break;
                case 4:
                    System.out.println("Su saldo minimo actual es de " + CuentaB.getSaldoMinimo());
                break;
                case 5:
                    System.out.println("Y su tipo de cuenta es de " + CuentaB.tipo);
                    System.out.println("Su capacidad de credito es de " + CuentaB.getCapacidadCredito());
                break;
                case 6:
                    System.out.println("Usted a salido del programa");
                return;
            }
        }
    }
}