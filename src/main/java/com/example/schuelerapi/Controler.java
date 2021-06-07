package com.example.schuelerapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class Controler {
    @GetMapping(path = "/index")
    public String index () {
        return "Hallo zusammen !";
    }
    
}
