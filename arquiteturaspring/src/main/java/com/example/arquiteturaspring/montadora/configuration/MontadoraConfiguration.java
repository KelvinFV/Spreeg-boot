package com.example.arquiteturaspring.montadora.configuration;

import com.example.arquiteturaspring.montadora.Motor;
import com.example.arquiteturaspring.montadora.TipoMotor;
import com.example.arquiteturaspring.montadora.api.Aspirado;
import com.example.arquiteturaspring.montadora.api.Eletrico;
import com.example.arquiteturaspring.montadora.api.Turbo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "/motorAspirado")
    @Aspirado
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCilindros(4);
        motor.setModelo("XPTP-0");
        motor.setLitragaem(2.0);
        motor.setTipoMotor(TipoMotor.Aspirado);

        return motor;
    }


    @Bean(name = "/motorEletrico")
    @Eletrico
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(260);
        motor.setCilindros(3);
        motor.setModelo("TH-40");
        motor.setLitragaem(1.4);
        motor.setTipoMotor(TipoMotor.Eletrico);

        return motor;
    }

    @Primary 
    @Bean(name = "/motorTurbo")
    @Turbo
    

    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(250);
        motor.setCilindros(4);
        motor.setModelo("XPTP-1");
        motor.setLitragaem(1.5);
        motor.setTipoMotor(TipoMotor.Turbo);

        return motor;
    }

}
