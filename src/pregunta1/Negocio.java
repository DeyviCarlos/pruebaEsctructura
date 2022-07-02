package pregunta1;

public class Negocio {
    private String nombre;
    private String recurso_principal;

    public Negocio() {
    }

    public Negocio(String nombre, String recurso_principal) {
        this.nombre = nombre;
        this.recurso_principal = recurso_principal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRecurso_principal() {
        return recurso_principal;
    }

    public void setRecurso_principal(String recurso_principal) {
        this.recurso_principal = recurso_principal;
    }
    
    
}
