package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //define que esse bean suporta requisições HTTP
public class WelcomeController {
    @GetMapping //define que esse recurso é do método HTTP GET
    public String welcome(){
        return "Welcome to my Spring Boot Web API!";
    };
    
}
