public class Fruta {
    private int codigo;
    private String nombre;
    private String categoria;
    private int precio;

    public Fruta(){
    }

    public Fruta(int codigo, String nombre, String categoria, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Codigo:" + codigo +
                "\nnombre:" + nombre +
                "\ncategoria:" + categoria +
                "\nprecio:" + precio + "\n"
                ;
    }
}
