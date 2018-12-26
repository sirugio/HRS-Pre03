package hrs.pre03;

public class Libro {
    private String nombre;
    private String autor;
    private String descripcion;
    private int paginas;
    
    public Libro() {
        nombre = "";
        autor = "";
        descripcion = "";
        paginas = -1;
    }
    
    public Libro(String nombre, String autor, String descripcion, int paginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Autor: " + autor + ", Descripcion: " + descripcion + ", Paginas: " + paginas;
    }
}
