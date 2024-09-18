/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutordocente;

/**
 *
 * @author angel
 */
public class DocenteHC1 extends Docente1 {
    
    private int horasTrab;
    private double valorHora, sueldoMesHoras;
    
    public DocenteHC1(String nombreDoc, String facultadDoc, String cadiDoc, int horasTrab, double valorHora) {
        super(nombreDoc, facultadDoc, cadiDoc);
        this.horasTrab=horasTrab;
        this.valorHora=valorHora;
        
        
    }
    
    public void establecerHorasTrab(){
         this.horasTrab=horasTrab;
    }
    public void establecerValorHora(){
        this.valorHora=valorHora;
    }
    @Override
    void calcular_salario() {
      sueldoMesHoras=horasTrab*valorHora;
    }
        
    @Override
    double salario(){
        return sueldoMesHoras;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombreDoc+"\nFacultad: "+facultadDoc+"\ncadi: "+cadiDoc+
                "\nSueldo: "+sueldoMesHoras;
                
    }

    
}
