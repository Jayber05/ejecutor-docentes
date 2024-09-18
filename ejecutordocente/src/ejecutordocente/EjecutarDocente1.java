/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutordocente;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class EjecutarDocente1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int eleccion,cantidaddoc; 
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("cuantos docentes desea ingresar");
        cantidaddoc= entrada.nextInt();

      ArrayList<Docente1> obj1= new ArrayList<>();
      
      for(int i=0; i<cantidaddoc; i++){
        
        System.out.println("Hola, que tipo de docente eres:\n1: Docente hora catedra\n2: Docente tiempo completo ocasional");
        eleccion=entrada.nextInt();
        
         String nombre, facultad, cadi;
         int horas, cantidad;
         double valorhora, sueldobasico;
        
        switch(eleccion){
            
            case 1:
                
                System.out.println("ingresa tu nombre");
                nombre=entrada.next();
                System.out.println("nombre de la facultad a la que perteneces");
                facultad=entrada.next();
                System.out.println("nombre del CADI que aplica");
                cadi=entrada.next();
                entrada.nextLine();
                System.out.println("horas trabajadas");
                horas=entrada.nextInt();
                entrada.nextLine();
                System.out.println("valor por hora");
                valorhora=entrada.nextDouble();
                entrada.nextLine();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                
                 
                
                obj1.add (new DocenteHC1(nombre, facultad, cadi, horas, valorhora));
                
                break;
                
            case 2:
                
                System.out.println("ingresa tu nombre");
                nombre=entrada.next();
                System.out.println("nombre de la facultad a la que perteneces");
                facultad=entrada.next();
                System.out.println("nombre del CADI que aplica");
                cadi=entrada.next();
                entrada.nextLine();
                System.out.println("sueldo fijo mensual");
                sueldobasico=entrada.nextDouble();
                System.out.println("cantidad de trabajos de grado que asesora");
                cantidad= entrada.nextInt();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                
                
                
                obj1.add(new DocenteTCO1(nombre, facultad, cadi, sueldobasico, cantidad));
                
                break;
                
            default:
                System.out.println("opcion no valida");
                break;
           
        }
      }
     double totalsalarios = 0;
        
        for (Docente1 docente : obj1) {
            
                docente.calcular_salario(); 
                System.out.println(docente.toString()); 
                System.out.println("");
            
                totalsalarios += docente.salario();
                
                
        }
        System.out.println("el total de los salarios obtenidos es: "+totalsalarios);
        
    }
    
}
