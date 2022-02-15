package com.spring.exercisebs41;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties
@PropertySource("/miconfiguracion.properties")
public class MiConfiguracion {
    String valor1,valor2;
}
