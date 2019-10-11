/**
 * Nombre: JefeEmpleados.java
 * Objetivo: generar objetos tipo jefeEmpleados
 * Autor: alumnos de MSC
 * Fecha: 10/10/2019
 */
package Dependencias;

public class JefeEmpleados implements Empleados{
    private String nombre;

    public JefeEmpleados(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getTarea(){
        return "Soy un empleado jefe y tengo la tarea de administrar recursos de mi departamentos";
    }
    
}
