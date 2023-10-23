package com.memorres.learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.memorres.learn.models.Index;

@RestController
public class IndexController {
    
    @GetMapping("/api/")
    public Index rootEndpoint() {
        // Shut the
        return new Index("welcome to test API");
    }

    @GetMapping("/api/echo/{name}")
    public Index echoEndpoint(@PathVariable String name) {
        return new Index(String.format("Echo: %s", name));
    }
}
