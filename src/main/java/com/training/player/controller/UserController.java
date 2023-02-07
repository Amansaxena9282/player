package com.training.player.controller;
import com.training.player.model.User;
import com.training.player.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getAll")
    public List<User>getAll(){
        return userService.getAll();
    }
    @PostMapping("/save")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}
