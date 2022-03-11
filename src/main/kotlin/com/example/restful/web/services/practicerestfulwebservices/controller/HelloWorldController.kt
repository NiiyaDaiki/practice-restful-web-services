package com.example.restful.web.services.practicerestfulwebservices.controller

import com.example.restful.web.services.practicerestfulwebservices.bean.HelloWorldBean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello-world")
    fun helloWorld(): String {
        return "Hello World!!"
    }

    @GetMapping("/hello-world-bean")
    fun helloWorldBean(): String {
        return HelloWorldBean("hello test!!!").toString();
    }
}

