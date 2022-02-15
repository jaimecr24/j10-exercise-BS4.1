package com.spring.exercisebs41;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class PerfilDefault implements Perfiles {

    private final String perfil = "perfil por defecto";

    public String miFuncion() {
        System.out.println(perfil);
        return perfil;
    }
}