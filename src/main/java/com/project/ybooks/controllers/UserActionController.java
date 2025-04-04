package com.project.ybooks.controllers;

import com.project.ybooks.models.UserAction;
import com.project.ybooks.services.UserActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ybook/useraction")
public class UserActionController {

    @Autowired
    UserActionService userActionService;

    @PostMapping("/save")
    public ResponseEntity<String> registerAction (@RequestBody UserAction userAction) {
        try {
            String returnMessage = this.userActionService.registerAction(userAction);
            return new ResponseEntity<>(returnMessage, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<UserAction>> findAllActions () {
        try {
            List<UserAction> list = this.userActionService.findAllActions();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}