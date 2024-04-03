public class licor {
    String nombre;
    int precio;
    String  categoria;
    String color;

    public licor(String nombre, int precio, String categoria, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  "Nombre=" + nombre +
                "\nprecio=" + precio +
                "\ncategoria=" + categoria +
                "\ncolor=" + color + "\n"
                ;
    }
}
