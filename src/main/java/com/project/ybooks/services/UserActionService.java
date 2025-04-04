package com.project.ybooks.services;

import com.project.ybooks.models.UserAction;
import com.project.ybooks.repositories.UserActionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserActionService {

    @Autowired
    UserActionRespository userActionRespository;

    public String registerAction (UserAction userAction) {
        userActionRespository.save(userAction);
        return "sucessfully";
    }

    public List<UserAction> findAllActions () {
        return userActionRespository.findAll();
    }
}