package com.example.arquiteturaspring.montadora.configuration;

import com.example.arquiteturaspring.montadora.Motor;
import com.example.arquiteturaspring.montadora.TipoMotor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCilindros(4);
        motor.setModelo("XPTP-0");
        motor.setLitragaem(2.0);
        motor.setTipoMotor(TipoMotor.Aspirado);

        return motor;
    }

}
