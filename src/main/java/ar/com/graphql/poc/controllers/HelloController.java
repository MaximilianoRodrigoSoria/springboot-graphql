package ar.com.graphql.poc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    @RequestMapping("/")
    public String index() {
        return "Ingreso a API";
    }

    @GetMapping
    @RequestMapping("/hello")
    public String hello() {
        return "Hola mundo";
    }
}
