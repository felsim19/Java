import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int Apuesta = 200;
        int Jugador1;
        int Jugador2;
        int Apostar;
        int ApostarP;
        System.out.println("Bienvenido Al Juego, No puede Apostar menos de $100");
        System.out.println("Ingrese El valor que desea Apostar Jugador 1");
        Jugador1 = Entrada.nextInt();
        System.out.println("Ingrese El valor que desea Apostar Jugador 2");
        Jugador2 = Entrada.nextInt();
        if (Jugador1 >= 100 && Jugador2 >= 100) {
            while (Jugador1 > 0 && Jugador2 > 0 && Apuesta > 0){
                int Dado = (int) Math.floor(Math.random() * 6 + 1);
                int Dado3 = (int) Math.floor(Math.random() * 6 + 1);
                System.out.println("Jugador 1 usted saco " + Dado);
                if (Dado == 1 || Dado == 6) {
                    Jugador1 -= 100;
                    Apuesta += 100;
                    System.out.println("Usted saco 1 o 6 por la tanto pierde 100");
                    System.out.println("El saldo del jugador 1 es " + Jugador1);
                    System.out.println("El Saldo de la Apuesta es " + Apuesta);
                } else {
                    System.out.println("Que Desea Hacer 1.Apostar Todo o 2.Apostar Una Parte");
                    Apostar = Entrada.nextInt();
                    switch (Apostar) {
                        case 1: {
                            if (Apostar == 1) {
                                int Dado2 = (int) Math.floor(Math.random() * 6 + 1);
                                if (Dado2 > Dado) {
                                    Jugador1 += Apuesta;
                                    Apuesta = 0;
                                    System.out.println("El numero del dado es " + Dado2);
                                    System.out.println("Usted quedo con un Saldo de " + Jugador1);
                                    System.out.println("El Saldo de la apuesta es " + Apuesta);
                                } else {
                                    Apuesta += Jugador1;
                                    Jugador1 = 0;
                                    System.out.println("El numero del dado es " + Dado2);
                                    System.out.println("Usted quedo con un Saldo de " + Jugador1);
                                    System.out.println("El Saldo de la apuesta es " + Apuesta);
                                }
                            }
                        }
                        break;
                        case 2: {
                            if (Apostar == 2) {
                                System.out.println("Cuanto Desea Apostar");
                                ApostarP = Entrada.nextInt();
                                int Dado2 = (int) Math.floor(Math.random() * 6 + 1);
                                if (Dado2 > Dado) {
                                    Jugador1 += ApostarP;
                                    Apuesta -= ApostarP;
                                    System.out.println("El numero del dado es " + Dado2);
                                    System.out.println("Usted Aposto " + ApostarP);
                                    System.out.println("Usted quedo con un Saldo de " + Jugador1);
                                    System.out.println("El Saldo de la apuesta es " + Apuesta);
                                } else {
                                    Apuesta += ApostarP;
                                    Jugador1 -= ApostarP;
                                    System.out.println("El numero del dado es " + Dado2);
                                    System.out.println("Usted Aposto " + ApostarP);
                                    System.out.println("Usted quedo con un Saldo de " + Jugador1);
                                    System.out.println("El Saldo de la apuesta es " + Apuesta);
                                }
                            }
                        }
                        break;
                        default:
                            System.out.println("Ingrese Opciones Validas");
                    }

                }
                if(Jugador1 <= 0){
                    System.out.println("Lo siento Usted ah Perdido Jugador 1");
                    break;
                }
                if (Apuesta <= 0){
                    System.out.println("Lo siento El Saldo A quedado en 0");
                    break;
                }
                System.out.println("Jugador 2 usted saco " + Dado3);
                if (Dado3 == 1 || Dado3 == 6) {
                    Jugador2 -= 100;
                    Apuesta += 100;
                    System.out.println("Usted saco 1 o 6 por la tanto pierde 100");
                    System.out.println("El saldo del jugador 2 es " + Jugador2);
                    System.out.println("El Saldo de la Apuesta es " + Apuesta);
                } else {
                    System.out.println("Que Desea Hacer 1.Apostar Todo o 2.Apostar Una Parte");
                    Apostar = Entrada.nextInt();
                    switch (Apostar) {
                        case 1: {
                            if (Apostar == 1) {
                                int Dado4 = (int) Math.floor(Math.random() * 6 + 1);
                                if (Dado4 > Dado3) {
                                    Jugador2 += Apuesta;
                                    Apuesta = 0;
                                    System.out.println("El numero del dado es " + Dado4);
                                    System.out.println("Usted quedo con un Saldo de " + Jugador2);
                                    System.out.println("El Saldo de la apuesta es " + Apuesta);
                                } else {
                                    Apuesta += Jugador2;
                                    Jugador2 = 0;
                                    System.out.println("El numero del dado es " + Dado3);
                                    System.out.println("Usted quedo con un Saldo de " + Jugador2);
                                    System.out.println("El Saldo de la apuesta es " + Apuesta);
                                }
                            }
                        }
                        break;
                        case 2: {
                            if (Apostar == 2) {
                                System.out.println("Cuanto Desea Apostar");
                                ApostarP = Entrada.nextInt();
                                int Dado4 = (int) Math.floor(Math.random() * 6 + 1);
                                if (Dado4 > Dado3) {
                                    Jugador2 += ApostarP;
                                    Apuesta -= ApostarP;
                                    System.out.println("El numero del dado es " + Dado4);
                                    System.out.println("Usted Aposto " + ApostarP);
                                    System.out.println("Usted quedo con un Saldo de " + Jugador2);
                                    System.out.println("El Saldo de la apuesta es " + Apuesta);
                                } else {
                                    Apuesta += ApostarP;
                                    Jugador2 -= ApostarP;
                                    System.out.println("El numero del dado es " + Dado4);
                                    System.out.println("Usted Aposto " + ApostarP);
                                    System.out.println("Usted quedo con un Saldo de " + Jugador2);
                                    System.out.println("El Saldo de la apuesta es " + Apuesta);
                                }
                            }
                        }
                        break;
                        default:
                            System.out.println("Ingrese Opciones Validas");
                    }
                }
                if(Jugador2 <= 0){
                    System.out.println("Lo siento Usted ah Perdido Jugador 2");
                    break;
                }
                if (Apuesta <= 0){
                    System.out.println("Lo siento El Saldo A quedado en 0");
                    break;
                }
            }
        }else{
            System.out.println("No cuentan con El presupuesto para jugar,vuelve vuando ya hallas consegido");
        }
    }
}
