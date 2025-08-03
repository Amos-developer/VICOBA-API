package com.vocoba.vicobaapi.Controllers;

import com.vocoba.vicobaapi.Entity.User;
import com.vocoba.vicobaapi.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/read")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/read/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updateUser){
        return userService.updateUser(updateUser, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}
