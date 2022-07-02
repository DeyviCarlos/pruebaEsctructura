package pregunta1;

import java.util.Scanner;

public class ListaNegocio {
    NodoNegocio cab;
    Scanner leer=new Scanner(System.in);
    
    public ListaNegocio(){
        this.cab = null; 
    }
    
    public void creaLista(){
        if(this.cab == null){
            System.out.println("Negocio: ");
            String dato = leer.next();
            System.out.println("Insumo principal");
            String insumo = leer.next();
            
            Negocio negocio = new Negocio();
            negocio.setNombre(dato);
            negocio.setRecurso_principal(insumo);

            this.cab = new NodoNegocio(this.cab, negocio);
        }else{
            System.out.println("Lista no vacia");
        }
    }
    
    public void insertarIni(){
        NodoNegocio p, n = this.cab;
        
        System.out.println("Negocio: ");
        String dato = leer.next();
        System.out.println("Insumo principal");
        String insumo = leer.next();
        
        Negocio negocio = new Negocio();
        negocio.setNombre(dato);
        negocio.setRecurso_principal(insumo);
        
        p = new NodoNegocio(negocio);
        if(this.cab == null){
            this.cab = p;
        }else{
            p.siguiente = this.cab;
            this.cab = p;
        }   
    }
    
    public void recorrerLista(){
        NodoNegocio p;
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
    
    public void decision(String negocio){
        
        if(negocio.equalsIgnoreCase("alimento organico")){
            NodoNegocio p;
            p=this.cab;
            if(p==null){
                //System.out.println("Lista vaciaaaa...");}
                System.out.print("Lista vaciaaaa...");}
            else{
                while(p!=null){
                        if(p.elemento.getRecurso_principal().equalsIgnoreCase("uvas frescas")){
                            System.out.println("uvas frescas");
                            System.out.println("porcentaje es 11.4%");
                        }else if(p.elemento.getRecurso_principal().equalsIgnoreCase("los demas frutas u otros frutos frescos")){
                            System.out.println("los demas frutas u otros frutos frescos");
                            System.out.println("porcentaje es 8.3%");
                        }else{
                            System.out.println("wilkings e hibridos similares de citricos");
                            System.out.println("porcentaje es 8.3%");
                        }
                        p = p.siguiente;
                }
            }  
        }else {
            System.out.println("No es recomendable");
        }
              
        
    }
    
}
