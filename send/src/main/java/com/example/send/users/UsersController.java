package com.example.send.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UsersController {

    private final UsersService demoClass;

    @Autowired
    public UsersController(UsersService demoClass) {
        this.demoClass = demoClass;
    }

    @GetMapping("/a")
    public String displayWorking() {
        System.out.println("GET--->");
        return demoClass.getDemoVal() != null ? demoClass.getDemoVal() : "Value is not set.";
    }

    @PostMapping("/b")
    public String postWorking() {
        demoClass.setDemoVal("Demo Value");
        System.out.println("POST--->");
        return "Post Working! Value set to: ";
    }

    @PostMapping("/ab")
    public String postValueSet(@RequestBody String value) {
        demoClass.setDemoVal("New Demo Value : " + value);
        System.out.println("POST--->");
        return "Post Working! Value set to: ";
    }

    @PostMapping("/abc/{value}")
    public String postValueSetNew(@PathVariable String value) {
        demoClass.setDemoVal("New Demo Value : " + value);
        System.out.println("POST--->");
        return "Post Working! Value set to: ";
    }
}
