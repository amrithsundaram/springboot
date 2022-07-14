package com.amrith.app.rest.Controller;
import com.amrith.app.rest.Models.User;
import com.amrith.app.rest.Repo.UserRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")   
    public String  getPage(){
        return "IBM PROJECT";
    }

    @GetMapping(value = "/users")   
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")   
    public String saveUser(@RequestBody User user) {
        userRepo.save(user);
        return "Saved";
    }
    
}
