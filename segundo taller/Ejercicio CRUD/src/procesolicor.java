import java.util.ArrayList;
import java.util.Scanner;

public class procesolicor {
    Scanner sc = new Scanner(System.in);
    int ValorTotal = 0;
    private ArrayList<licor> lista = new ArrayList<>();

    public procesolicor() {
        lista.add(new licor("AGUARDIENTE", 45000, "AMARGO", "TRANSPARENTE"));
        lista.add(new licor("SMIRNOFF", 55000, "DULCE", "VERDE"));
        lista.add(new licor("WHISKY", 75000, "AMARGO", "AMARILLO"));
        lista.add(new licor("TEQUILA", 85000, "AMARGO", "AMARILLO"));
        lista.add(new licor("CERVEZA", 3000, "AMARGO", "OSCURA"));
    }

    public ArrayList<licor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<licor> lista) {
        this.lista = lista;
    }

    public int getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(int valorTotal) {
        ValorTotal = valorTotal;
    }

    public void MostrarLista(){
        for (licor l:this.lista){
            System.out.println(l.toString());
        }
    }
    public String Agregarlicor(licor l){
        boolean validar = false;
        String mensaje = "";
        for (licor i:this.lista){
            if (i.getNombre().equals(l.getNombre())){
                validar = true;
                mensaje = "Esta bebida ya existe";
            }
        }
        if (!validar){
            lista.add(l);
            mensaje = "Esta bebida a sido creada satisfactoriamente";
        }
        return mensaje;
    }

    public void EditarLicor(String editar){
        int indice = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(editar)){
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            int precio;
            String nombre, categoria, color;
            System.out.println("Licor encontrado en el índice: " + indice);
            System.out.println(lista.get(indice));
            System.out.println("Digite el nuevo nombre del licor");
            nombre = sc.next().toUpperCase();
            System.out.println("Digite el nuevo precio del licor");
            precio = sc.nextInt();
            System.out.println("Digite la nueva categoria del licor");
            categoria = sc.next().toUpperCase();
            System.out.println("Digite el nuevo color del licor");
            color = sc.next().toUpperCase();
            licor l = new licor(nombre,precio,categoria,color);
            lista.set(indice, l);
            System.out.println("Su licor a sido correctamente modificado");
        } else {
            System.out.println("Licor no encontrado. No se puede realizar la edición.");
        }
    }

    public void Bucar_Nombre(String busquedaN){
        String palabra = busquedaN.toUpperCase();
        boolean validar = false;
        for(licor l:this.lista){
            if (l.getNombre().equals(palabra)){
                validar = true;
                System.out.println(l.toString());
            }
        }
        if (!validar){
            System.out.println("Esa nombre no existe");
        }

    }
    public void Bucar_Categoria(String busquedaC){
        String palabra = busquedaC.toUpperCase();
        boolean validar = false;
        for(licor l:this.lista){
            if (l.getCategoria().equals(palabra)){
                validar = true;
                System.out.println(l.toString());
            }
        }
        if (!validar){
            System.out.println("Esa categoria no existe");
        }
    }

    public void Eliminarlicor(String eliminar){
        int indice = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(eliminar)){
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            lista.remove(indice);
            System.out.println("Su licor a sido eliminado correctamente");
        } else {
            System.out.println("Licor no encontrado. No se puede realizar la eliminacion.");
        }

    }

    public void Buscar_Venta(String buscar){
        int Vunidad, precio, totalR;
        boolean validar = false;
        for(licor l:this.lista){
            if (l.getNombre().equals(buscar)){
                validar = true;
                System.out.println("Esta es la informacion del producto\n" + l.toString());
                precio = l.getPrecio();
                System.out.println("Cuantas unidades desea llevar?");
                Vunidad = sc.nextInt();
                totalR = (precio*Vunidad);
                System.out.println("El total de la venta es: " + totalR);
                ValorTotal += totalR;
            }
        }
        if (!validar){
            System.out.println("Esa producto no existe");
        }

    }
}
