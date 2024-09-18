/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutordocente;

/**
 *
 * @author angel
 */
public class DocenteTCO1 extends Docente1 {
    private double sueldoMensual, valorHoraAsesor, asesoriaDoc, sueldoBasico;
    private int canTrabGrado;
    
    public DocenteTCO1( String nombreDoc, String facultadDoc, String cadiDoc, double sueldoBasico, int canTrabGrado) {
        super(nombreDoc, facultadDoc, cadiDoc);
        
        
        this.sueldoBasico = sueldoBasico;
        this.canTrabGrado = canTrabGrado;
    }
    public void establecerSueldoBasico(){
         this.sueldoBasico = sueldoBasico;
    }
    public void establecerCanTrabGrado(){
          this.canTrabGrado = canTrabGrado;
    }
    public void establecerValorHoraAsesor(){
         valorHoraAsesor = sueldoBasico/240;
    }
    @Override
    void calcular_salario(){
        valorHoraAsesor = sueldoBasico/240;
         asesoriaDoc=canTrabGrado*valorHoraAsesor;
         sueldoMensual=sueldoBasico+asesoriaDoc;
    }
    
    @Override
    double salario(){
        return sueldoMensual;
    }
    
    @Override
     public String toString(){
        return "Nombre: "+nombreDoc+"\nFacultad: "+facultadDoc+"\ncadi: "+cadiDoc+
                "\nSueldo: "+sueldoMensual;

     }
}
