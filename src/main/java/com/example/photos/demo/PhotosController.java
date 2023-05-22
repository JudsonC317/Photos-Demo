package com.example.photos.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotosController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
