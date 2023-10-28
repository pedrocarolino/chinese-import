package com.imports.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class testController {

    @GetMapping
    public String getTestString() {
        return "Test Pedro";
    }
}
