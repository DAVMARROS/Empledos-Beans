/**
 * Nombre: JefeEmpleados.java
 * Objetivo: generar objetos tipo directorEmpleados
 * Autor: alumnos de MSC
 * Fecha: 10/10/2019
 */
package Dependencias;

public class DirectorEmpleados implements Empleados{
    private String nombre;

    public DirectorEmpleados(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getTarea(){
        return "Soy director y tengo la tarea de administrar los recursos de la empresa"; 
    }
}
