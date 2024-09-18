/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutordocente;

/**
 *
 * @author angel
 */
abstract class Docente1 {
    
    protected String nombreDoc, facultadDoc, cadiDoc;
    
    public Docente1 (String nombreDoc, String facultadDoc, String cadiDoc){
        
        this.nombreDoc=nombreDoc;
        this.facultadDoc=facultadDoc;
        this.cadiDoc=cadiDoc;
    }
    
    public void establecerNombreDoc(){
        this.nombreDoc=nombreDoc;
}
    public void establecerFacultadDoc(){
        this.facultadDoc=facultadDoc;
    }
    public void establecerCadiDoc(){
        this.cadiDoc=cadiDoc;
    }
    
    abstract void calcular_salario();
    
    abstract double salario();
    
    public String toString(){
        return "Nombre: "+nombreDoc+"\nFacultad: "+facultadDoc+"\ncadi: "+cadiDoc;
       
    }

    
    
}
