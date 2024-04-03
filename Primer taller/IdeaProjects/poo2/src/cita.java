public class cita {
    public int numero;
    public int tipo;
    public double tarifa;
    public double ValorFinal;

    public cita(int numero, int tipo, double tarifa){
        this.numero = numero;
        this.tipo = tipo;
        this.tarifa = tarifa;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTipo(){
        if(tipo >= 1 && tipo <=3){
            return "General";
        } else if (tipo >= 4 && tipo <=5) {
            return "Especialista";
        }else {
            return "ERROR";
        }
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    public double getTarifa(){
        return this.tarifa;
    }

    public void setTarifa(double tarifa){
        this.tarifa = tarifa;
    }

    public double getValorFinal(){
        double ValorFinal = tarifa;
        String TIPOCITA = getTipo();
        if (TIPOCITA.equals("General")){
            return ValorFinal = ValorFinal - (ValorFinal * 0.50);
        }else if(TIPOCITA.equals("Especialista")){
            return ValorFinal = ValorFinal + (ValorFinal * 0.50);
        }else{
            return 0;
        }
    }

    public void  setValorFinal(double valorFinal){
        this.ValorFinal = valorFinal;
    }
}
