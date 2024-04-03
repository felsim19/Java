import java.util.Random;
public class password {
    int logintud = 8;
    String contraseña;

    public password(){
    }

    public password(int logintud, String contraseña){
        this.logintud = logintud;
        this.contraseña = contraseña;
    }
    public int getLogintud(){
        return this.logintud;
    }
    public void setLogintud(int logintud){
        this.logintud = logintud;
    }
    public String generarPassword(){
        Random r = new Random();
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        String abecedarioMayuscula = abecedario.toUpperCase();
        String numeros = "0123456789";
        String caracteres = abecedario + abecedarioMayuscula + numeros;
        contraseña = "";
        logintud = getLogintud();
        for (int i = 1; i <= logintud; i++){
            int posicion =r.nextInt(caracteres.length());
            char caracter =caracteres.charAt(posicion);
            contraseña += caracter;
        }
        return contraseña;
    }
    public String getContraseña(){return this.contraseña;}

    public boolean esFuerte(String contraseña){
        int mayuscula = 0;
        int minuscula = 0;
        int numeros = 0;
        for (char caracter : contraseña.toCharArray()){
            if(Character.isDigit(caracter)){
                numeros ++;
            } else if (Character.isLowerCase(caracter)) {
                minuscula ++;
            } else if (Character.isUpperCase(caracter)) {
                mayuscula ++;
            }
        }
        return numeros >= 5 && minuscula >=1 && mayuscula >=2;
    }

}
