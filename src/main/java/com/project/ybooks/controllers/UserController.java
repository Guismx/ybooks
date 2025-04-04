package com.project.ybooks.controllers;

import com.project.ybooks.models.User;
import com.project.ybooks.repositories.UserRepository;
import com.project.ybooks.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ybook/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/register")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        try {
            String responseMessage = userService.createUser(user);
            return new ResponseEntity<>(responseMessage, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/userupdate/{id}")
    public ResponseEntity<String> updateUser (@RequestBody User user, @PathVariable Long id) {
        try {
            String responseMessage = userService.updateUser(user, id);
            return new ResponseEntity<>(responseMessage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error updating user", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser (@PathVariable Long id) {
        try {
            String responseMessage = this.userService.deleteUser(id);
            return new ResponseEntity<>(responseMessage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/allusers")
    public ResponseEntity<List<User>> allUsers () {
        try {
            List<User> users = this.userService.allUsers();
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/finduser/{id}")
    public ResponseEntity<User> userById (@PathVariable Long id) {
        try {
            User responseUser = this.userService.userById(id);
            if (responseUser == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Retorna 404 se o usuário não existir
            }
            return new ResponseEntity<>(responseUser, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}