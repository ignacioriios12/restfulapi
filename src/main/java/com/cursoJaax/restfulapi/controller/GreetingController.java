package com.cursoJaax.restfulapi.controller;

import com.cursoJaax.restfulapi.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template ="Hola, %s";  /* template = plantilla*/
    private final AtomicLong counter= new AtomicLong();  /* counter = contador */
    
    
    @GetMapping("/greeting")
    public Greeting HelloWorld(@RequestParam(value ="name", defaultValue  = "World" )String name){

        return new Greeting(counter.incrementAndGet(), String.format(template,name));
        
    }

}
