package org.example.test_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.example.test_1.hello")
public class Test1Application {

    public static void main(String[] args) {
        SpringApplication.run(Test1Application.class, args);
    }



}
