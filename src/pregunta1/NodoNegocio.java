package pregunta1;

public class NodoNegocio {
    public Negocio elemento;
    public NodoNegocio siguiente;
    
    public NodoNegocio(Negocio elemento){
        this.elemento = elemento;
        this.siguiente = null; 
    }
    public NodoNegocio(NodoNegocio siguiente, Negocio elemento){
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
}
