package com.example.webappsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
    
    @GetMapping("/page/{id}")
    private String pageReturn(@PathVariable(name="id") String id){
        System.out.println("Request received with id:"+id);
        return id;
    }

    @GetMapping({"/"})
    public String index()
    {
      return "Greetings from Spring Boot!";
    }

}   
