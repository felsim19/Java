public class persona {
    private static final char Sexo_Defecto = 'H';
    private static  final  int Peso_bajo= -1;
    private static  final  int Peso_medio= 0;
    private static  final  int Peso_alto= 1;

    String nombre;
    int edad;
    String dni;
    char sexo ;
    float peso;
    float altura;

    public persona(){
        generardni();
    }

    public persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generardni();
    }

    public persona(String nombre, int edad, char sexo, float peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generardni();
    }

    public int calcularimc(){
        double imc = peso/ Math.pow(altura, 2);
        if (imc < 20){
            System.out.println("El resultado es " + imc);
            System.out.println("el resultado del imc es menos de 20");
            return Peso_bajo;
        } else if (imc >= 20 && imc < 25 ) {
            System.out.println("El resultado es " + imc);
            System.out.println("el resultado esta entre 20 y 25");
            return Peso_medio;
        } else if(imc > 25) {
            System.out.println("El resultado es " + imc);
            System.out.println("Es mayor que 25 ");
            return  Peso_alto;
        }else {
            return 0;
        }
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    private char comprobarSexo(char sexo){
        return (sexo == 'H' || sexo == 'M')? sexo : Sexo_Defecto;
    }
    private void generardni(){
        int numeroAleatorio = (int) (Math.random() * 90000000) + 10000000;
        char letradni = calcularLetraDNI(numeroAleatorio);
        dni = Integer.toString(numeroAleatorio) + letradni;
    }

    private char calcularLetraDNI(int numeroDNI) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letrasDNI.charAt(numeroDNI % 23);
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nDNI: " + dni +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
