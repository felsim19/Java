public class bus {

    String placa;
    int cantidadPasajeros;
    double precioPasaje;
    int pasajerosActuales;
    int pasajerosAdicionales;
    int totalPasajeros;

    public bus(String placa, int cantidadPasajeros, double precioPasaje, int pasajerosActuales, int pasajerosAdicionales){
        this.placa = placa;
        this.cantidadPasajeros = cantidadPasajeros;
        this.precioPasaje = precioPasaje;
        this.pasajerosActuales = pasajerosActuales;
        this.pasajerosAdicionales = pasajerosAdicionales;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getCantidadPasajeros(){return this.cantidadPasajeros;}
    public void setCantidadPasajeros(int cantidadPasajeros){this.cantidadPasajeros = cantidadPasajeros;}
    public double getPrecioPasaje(){
        return this.precioPasaje;
    }
    public void setPrecioPasaje(double precioPasaje){
        this.precioPasaje = precioPasaje;
    }

    public int getPasajerosActuales(){
        return this.pasajerosActuales;
    }

    public int getPasajerosAdicionales(){return this.pasajerosAdicionales;}
    public void setPasajerosAdicionales(int pasajerosAdicionales) {
        if (pasajerosAdicionales <= 0) {
            System.out.println("La cantidad de pasajeros adicionales debe ser mayor que cero");
            return;
        }else{
            this.pasajerosAdicionales = pasajerosAdicionales;
        }
    }

    public void setPasajerosActuales(int pasajerosActuales){
        if (pasajerosActuales >= this.cantidadPasajeros){
            System.out.println("usted no puede sobrepasar la cantidad maxima");
            return;
        }else{
            this.pasajerosActuales = pasajerosActuales;
            this.totalPasajeros = pasajerosActuales;
        }
    }

    public void SubirPasajeros(){
        if (this.pasajerosActuales + this.pasajerosAdicionales > this.cantidadPasajeros) {
            System.out.println("Usted no puede subir más de " + this.cantidadPasajeros + " personas");
            return;
        }else{
            this.pasajerosActuales += this.pasajerosAdicionales;
            this.totalPasajeros += this.pasajerosAdicionales;
            System.out.println(this.pasajerosAdicionales);
            System.out.println("Pasajeros actuales: " + this.pasajerosActuales);
        }
    }

    public void BajarPasajeros(){
        if (this.pasajerosActuales - this.pasajerosAdicionales < 0) {
            System.out.println("Usted no puede bajar más de 0 personas");
            return;
        }else{
            this.pasajerosActuales -= this.pasajerosAdicionales;
            System.out.println(this.pasajerosAdicionales);
            System.out.println("Pasajeros actuales: " + this.pasajerosActuales);
        }
    }

    public void getTotalPasajeros(){
        double Vtotal = this.precioPasaje * this.totalPasajeros;
        System.out.println("El total de pasajeros hasta el momento fue " + this.totalPasajeros);
        System.out.println("por lo tanto el valor a pagar es " + Vtotal);
    }
}
