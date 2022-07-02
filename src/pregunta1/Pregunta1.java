package pregunta1;

import java.util.Scanner;

public class Pregunta1 {


    public static void main(String[] args) {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        ListaNegocio a = new ListaNegocio();
        //a.recorrerLista();
/*
        a.creaLista();
        a.recorrerLista();
        a.insertarIni();
*/
        while (opcion != 5) {
            System.out.printf("\t\tOperaciones de Negocio\n\n");
            System.out.println("1.- Crear una lista Negocio ");
            System.out.println("2.- Insertar Negocio");
            System.out.println("3.- Mostrar la lista");
            System.out.println("4.- Decisión de Negocio");
            System.out.println("5.- Salir");
            System.out.print("Ingrese su Opcion : ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    a.creaLista();
                    break;
                case 2:
                    a.recorrerLista();
                    break;
                case 3:
                    a.insertarIni();
                    break;
                case 4:
                    Scanner decide = new Scanner(System.in);
                    String negocio = decide.next();
                    a.decision(negocio);
                    break;  
                default: 
                    break;
            }
        }
        
        
    }
    
}
