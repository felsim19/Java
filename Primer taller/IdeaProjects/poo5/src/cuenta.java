public class cuenta {
    String numero;
    String tipo;
    double saldoActual;
    double saldoMinimo;

    public cuenta(String numero, String tipo, double ValorInicial){
        this.numero = numero;
        this.tipo = tipo;
        this.saldoActual = ValorInicial;
    }
    public void setNumero(String numero){this.numero = numero;}
    public void setTipo(String tipo){
        String nuevotipo = tipo.toUpperCase();
        if (nuevotipo.equals("AHORRO")){
            this.tipo = nuevotipo;
        } else if (nuevotipo.equals("CREDITO")) {
            this.tipo = nuevotipo;
        }else{
            System.out.println("Ese tipo de cuenta no es valido");
            return;
        }
    }
    public void setSaldoActual(double saldoActual){
        this.saldoActual = saldoActual;
        this.saldoMinimo = saldoActual*0.10;
    }

    public void consignar(double monto){
        this.saldoActual += monto;
        System.out.println("Su saldo actual es de " + this.saldoActual);
    }
    public void retirar(double monto){
        if (this.saldoActual - monto < this.saldoMinimo){
            System.out.println("Usted no puede retirar toda la plata tiene que dejar el saldo minimo");
            System.out.println("el saldo minimo actual es de " + this.saldoMinimo);
            return;
        }else {
            this.saldoActual -= monto;
            System.out.println("Su saldo actual es de " + this.saldoActual);
        }
    }
    public double getSaldoActual(){
        return saldoActual;
    }
    public double getSaldoMinimo(){
        return saldoMinimo;
    }
    public double getCapacidadCredito(){
        double capacidad = 0;
        if (this.tipo.equals("AHORRO")){
            capacidad = (this.saldoActual - this.saldoMinimo);
        } else if (this.tipo.equals("CREDITO")) {
            capacidad = (this.saldoActual * 3);
        }
        return capacidad;
    }
}
