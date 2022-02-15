package com.spring.exercisebs41;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controlador {

    @Value("${url}")
    private String url;

    @Value("${password}")
    private String password;

    @Autowired MiConfiguracion miConfiguracion;

    @Autowired Perfiles perfilActivo;
    //@Autowired private Environment environment;

    @GetMapping("/parametros")
    public Object getParametros(){
        Map<String,String> res = new HashMap<>();
        res.put("url",url);
        res.put("password",password);
        return res;
    }

    @GetMapping("/miconfiguracion")
    public Object getConfiguracion(){
        return miConfiguracion;
    }

    @GetMapping("/perfil")
    public Object getPerfil(){
        Map<String,Object> res = new HashMap<>();
        res.put("perfil",perfilActivo.miFuncion());
        //res.put("perfil",environment.getActiveProfiles()[0]);
        return res;
    }

    @PostConstruct
    void printVariables(){
        System.out.println("valor1: "+miConfiguracion.valor1);
        System.out.println("valor2: "+miConfiguracion.valor2);
    }
}
