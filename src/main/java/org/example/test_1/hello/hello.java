package org.example.test_1.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/test")
    public String hello() {
        return "Hello Super Coding World";
    }



}
