package com.fl.dol.middlewaresdsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class MiddlewareSdsApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(MiddlewareSdsApiApplication.class, args);
    }

    @RequestMapping("/")
    String sayHello() {
        return "Hello World From Middleware Application Try !";
    }

    @PostMapping("/hello")
    String sayHelloandHi() {
        return "Its calling the Hi & Hello world Together From Middleware Application!";
    }

    @GetMapping("/getone")
    public @ResponseBody ResponseEntity<String> get() {
        return new ResponseEntity<String>("GET Response From Middleware Application", HttpStatus.OK);
    }

    @PostMapping("/testtwo")
    public @ResponseBody ResponseEntity<String> posttwo() {
        return new ResponseEntity<String>("POST Response From Middleware Application", HttpStatus.OK);
    }



}
