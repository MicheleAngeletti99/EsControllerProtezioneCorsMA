package com.example.controllerprotezionecors.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:63342"})
public class NameController {

    @GetMapping("/getName")
    public String getName(@RequestParam(name = "name") String name){
        return name;
    }

    @PostMapping("/postName")
    public String postName(@RequestParam(name = "name") String name){
        StringBuilder nameString = new StringBuilder(name);
        return nameString.reverse().toString();
    }
}
