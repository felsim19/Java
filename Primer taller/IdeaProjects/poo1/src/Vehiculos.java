public class Vehiculos {
    public int modelo;
    public String marca;
    public float cilindraje;
    public String placa;
    public String color;
    public String estado;
    public int velocidad;


    public Vehiculos() {
        this.velocidad = 0;
        this.estado = "Detenido";
    }

    public Vehiculos(String placa, String color, String marca, int modelo) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.estado = "Detenido";

    }

    public void Arrancar() {
        if (this.estado.equals("Detenido")) {
            System.out.println("vehiculo en movimiento ");
            this.estado = "Movimiento";
            this.velocidad = 10;
            System.out.println("Su velocidad es " + velocidad);
        } else {
            System.out.println("El vehiculo esta en movimiento ");
        }
    }

    public String ModificarColor(String color){
        this.color= color;
        String Mensaje = "Color modificado" + this.color;

    return Mensaje;
    }

    public void Acelerar(){
        if (this.velocidad == 120){
            this.velocidad -= 10;
            System.out.println("Su velocidad es de 120 por lo tanto ya no puede acelerar mas");
        }
        if (this.velocidad >= 10){
            this.velocidad += 10;
            System.out.println("Su velocidad actual es de " + velocidad);
        }else{
            System.out.println("errores");
        }
    }

    public void Frenar(){
        if (this.velocidad <= 120){
            this.velocidad -= 10;
            System.out.println("Su velocidad Actual es de " + velocidad);
        }else {
            System.out.println("Problemas con los frenos");
        }
        if (this.velocidad == 0){
            this.velocidad += 10;
            System.out.println("Su velocidad actual es de 0 por lo tanto no puede frenar mas");
        }
    }

    public void Detener(){
        if (this.velocidad <= 20 && this.estado.equals("Movimiento")){
            this.estado = "Detenido";
            this.velocidad = 0;
            System.out.println("Su velocidad actual es de " + velocidad);
            System.out.println("Su estado actual es " + estado);
        }else{
            System.out.println("No se pudo detener");
        }
    }

    public int getModelo(){
        return this.modelo;
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public float getCilindraje(){
        return this.cilindraje;
    }

    public void setMarca(float cilindraje){
        this.cilindraje = cilindraje;
    }

}
