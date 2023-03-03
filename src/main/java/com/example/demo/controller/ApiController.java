package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prueba")
public class ApiController {

    @GetMapping()
    public ResponseEntity<?> findById() {
        return ResponseEntity.ok("Alooo");
    }
}