/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependencias;

/**
 *
 * @author david
 */
public class ProfesorEmpleados implements Empleados{
    private String nombre;

    public ProfesorEmpleados(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getTarea(){
        return "Soy profesor y tengo la tarea de dar clases"; 
    }
}
