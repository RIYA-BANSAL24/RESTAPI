package com.RestApi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "Hello from Riya Bansal!!";
    }
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from Riya Bansal";
    }
    @GetMapping("/param/{name}")
    public String sayHelloWithPathVar(@PathVariable String name) {
        return "Hello " + name + " from Riya Bansal";
    }
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from Riya Bansal";
    }

    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from Riya Bansal";
    }
}

class User {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
//url--for post request in postman
//http://localhost:8080/hello/post
//o/p---- Hello Riya Bansal