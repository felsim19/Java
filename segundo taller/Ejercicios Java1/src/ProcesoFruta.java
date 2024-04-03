import java.util.ArrayList;

public class ProcesoFruta {
    private ArrayList<Fruta> lista = new ArrayList<>();
    public ProcesoFruta(){
        lista.add(new Fruta(1, "naranja", "ACIDA", 1800));
        lista.add(new Fruta(2, "mandarina", "ACIDA", 1500));
        lista.add(new Fruta(3, "manzana verde", "ACIDA", 2000));
        lista.add(new Fruta(4, "kiwi", "DULCE", 6500));
        lista.add(new Fruta(5, "manzana roja", "DULCE", 2500));
    }

    public ArrayList<Fruta> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Fruta> lista) {
        this.lista = lista;
    }

    public void Mostrarlista(){
        for(Fruta f:this.lista){
            System.out.println(f.toString());
        }
    }

    public String AgregarFruta(Fruta f){
        boolean validar = false;
        String mensaje = "";
        for (Fruta i:this.lista){
            if (i.getCodigo() == f.getCodigo() || i.getNombre().equals(f.getNombre())) {
                validar = true;
                mensaje = "esta codigo y fruta ya existe";

            }
        }
        if (!validar){
            lista.add(f);
            mensaje = "Esta fruta ya ha sido agregada";
        }
        return mensaje;
    }

    public void Buscar_CategoriaF(String buscar){
        String palabra = buscar.toUpperCase();
        boolean validar = false;
        for(Fruta i:this.lista){
            if (i.getCategoria().equals(palabra)){
                validar = true;
                System.out.println(i.toString());
            }
        }
        if (!validar){
            System.out.println("Esa categoria no existe");
        }
    }
}

