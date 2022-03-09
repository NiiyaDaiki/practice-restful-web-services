package com.example.restful.web.services.practicerestfulwebservices

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello-world")
    fun helloWorld(): String {
        return "Hello World"
    }
}