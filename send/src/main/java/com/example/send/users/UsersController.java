package com.example.send.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UsersController {

    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/login")
    public String displayWorking() {
        System.out.println("GET--->");
        return usersService.getDemoVal() != null ? usersService.getDemoVal() : "Value is not set.";
    }

    @PostMapping("/signup")
    public String postWorking() {
        usersService.setDemoVal("Demo Value");

        System.out.println("POST--->");
        return "Post Working! Value set to: ";
    }

    @PostMapping("/save-user")
    public String postValueSet(@RequestBody String value) {
        usersService.setDemoVal("New Demo Value : " + value);
        System.out.println("POST--->");
        return "Post Working! Value set to: ";
    }
}
