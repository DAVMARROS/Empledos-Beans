/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependencias;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public JefeEmpleados jefe() {
        return new JefeEmpleados("David");
    }
    @Bean
    public DirectorEmpleados director() {
        return new DirectorEmpleados("Joel");
    }
    @Bean
    public SecretariaEmpleados secretaria() {
        return new SecretariaEmpleados("Isis");
    }
    @Bean
    public IntendenteEmpleados intendente() {
        return new IntendenteEmpleados("Juan");
    }
    
    @Bean
    public ProfesorEmpleados profesor() {
        return new ProfesorEmpleados("Jesus");
    }
}
