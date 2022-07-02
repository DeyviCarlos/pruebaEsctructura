
package pregunta1;

public class NodoPais {
    
    public Pais elemento;
    public NodoPais siguiente;
    
    public NodoPais(Pais elemento){
        this.elemento = elemento;
        this.siguiente = null; 
    }
    public NodoPais(NodoPais siguiente, Pais elemento){
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
}
