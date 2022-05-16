package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Inyeectar variable de appproperties
    @Value("${app.message}")
    String message;
    @GetMapping("/hola")

    public String holaMundo(){
        System.out.println(message);
        return "Hola mundo que talasdasd vamos!!";
    }


}
