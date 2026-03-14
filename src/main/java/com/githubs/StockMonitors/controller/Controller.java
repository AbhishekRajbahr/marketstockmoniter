package com.githubs.StockMonitors.controller;

import com.githubs.StockMonitors.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> getHellow(){

        return ResponseEntity.ok(service.getStock());
    }
}
