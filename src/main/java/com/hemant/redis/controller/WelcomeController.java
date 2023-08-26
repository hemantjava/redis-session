package com.hemant.redis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/hello")
public class WelcomeController {

    @GetMapping("/{name}")
    ResponseEntity<String> getMessage(@PathVariable String name){
        return ResponseEntity.of(Optional.of("Hi "+name+" How are you!!"));
    }
}
