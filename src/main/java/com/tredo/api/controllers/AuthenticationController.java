package com.tredo.api.controllers;

import com.tredo.api.models.User;
import com.tredo.api.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by mfebrianto on 12/01/2017.
 */

@RestController
public class AuthenticationController {

    @RequestMapping(value="/api/register", method=RequestMethod.POST, produces = "application/json")
    public User greeting(@RequestParam(value="email") String email,
                         @RequestParam(value="password") String password,
                         @RequestParam(value="passwordConfirmation") String passwordConfirmation) {
        User user = new User(0, email, password, passwordConfirmation);

        UserService userService = new UserService();
        try {
            userService.postUser(user);
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        return user;
    }

//    @RequestMapping("/login")

//    @RequestMapping("/login")

}
