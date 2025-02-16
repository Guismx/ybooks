package com.project.ybooks.services;


import com.project.ybooks.models.User;
import com.project.ybooks.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser (User user) {
        this.userRepository.save(user);
        return "User created with succesfully";
    }

    public String uptadeUser (User user, Long id) {
        user.setId(id);
        this.userRepository.save(user);
        return "User update with sucessfully";
    }

    public String deleteUser (Long id) {
        this.userRepository.deleteById(id);
        return "user deleted with success";
    }

    public List<User> allUsers() {
        return this.userRepository.findAll();
    }

}
