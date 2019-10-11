/**
 * Nombre: JefeEmpleados.java
 * Objetivo: generar objetos tipo secretariaEmpleados
 * Autor: alumnos de MSC
 * Fecha: 10/10/2019
 */
package Dependencias;

public class SecretariaEmpleados implements Empleados{
    private String nombre;

    public SecretariaEmpleados(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getTarea(){
        return "Soy secretaria y tengo la tarea de administrar la agenda de los jefes"; 
    }
}
