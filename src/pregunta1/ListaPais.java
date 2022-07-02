package pregunta1;

import java.util.Scanner;

public class ListaPais {
    NodoPais cab;
    Scanner leer=new Scanner(System.in);
    
    public ListaPais(){
        this.cab = null; 
    }
    
    public void creaLista(){
        if(this.cab == null){
            System.out.println("Pais: ");
            String dato = leer.next();
            Pais pais = new Pais();
            pais.setNombre(dato);
            this.cab = new NodoPais(this.cab, pais);
        }else{
            System.out.println("Lista no vacia");
        }
    }
    
    public void insertarIni(){
        NodoPais p, n = this.cab;
        Pais pais;
        System.out.println("Insertar País: ");
        String dato = leer.next();
        pais = new Pais();
        pais.setNombre(dato);
        
        p = new NodoPais(pais);
        if(this.cab == null){
            this.cab = p;
        }else{
            p.siguiente = this.cab;
            this.cab = p;
        }   
    }
    
    public void recorrerLista(){
        NodoPais p;
        p=this.cab;
        System.out.print("Lista = < ");
        if(p==null){
            //System.out.println("Lista vaciaaaa...");}
            System.out.print("Lista vaciaaaa...");}
        else{
            while(p!=null){
                    System.out.print(p.elemento.getNombre()+",");
                    p = p.siguiente;
            }
        }
        System.out.println(">");      
   }
    
    
}
