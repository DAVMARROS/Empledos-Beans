/**
 * Nombre: JefeEmpleados.java
 * Objetivo: instancia los diferentes tipos de objetos
 * Autor: alumnos de MSC
 * Fecha: 10/10/2019
 */
package Dependencias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados{
    public static void main(String[] args) {
        /*
        Empleados e1 = new DirectorEmpleados();
        System.out.println(e1.getTarea());
        Empleados e2 = new JefeEmpleados();
        System.out.println(e2.getTarea());
        Empleados e3 = new SecretariaEmpleados();
        System.out.println(e3.getTarea());
        */
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        JefeEmpleados jefe = ctx.getBean(JefeEmpleados.class);
        System.out.println("Soy "+jefe.getNombre()+" y "+jefe.getTarea());
        DirectorEmpleados dir = ctx.getBean(DirectorEmpleados.class);
        System.out.println("Soy "+dir.getNombre()+" y "+dir.getTarea());
        SecretariaEmpleados sec = ctx.getBean(SecretariaEmpleados.class);
        System.out.println("Soy "+sec.getNombre()+" y "+sec.getTarea());
        IntendenteEmpleados inten = ctx.getBean(IntendenteEmpleados.class);
        System.out.println("Soy "+inten.getNombre()+" y "+inten.getTarea());
        ProfesorEmpleados prof = ctx.getBean(ProfesorEmpleados.class);
        System.out.println("Soy "+prof.getNombre()+" y "+prof.getTarea());
    }
}
