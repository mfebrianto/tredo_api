package com.tredo.api.controllers;

import com.tredo.api.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mfebrianto on 12/01/2017.
 */

@RestController
public class AuthenticationController {

    @RequestMapping(value="/api/register", method=RequestMethod.POST, produces = "application/json")
    public User greeting(@RequestParam(value="email") String email,
                         @RequestParam(value="password") String password,
                         @RequestParam(value="passwordConfirmation") String passwordConfirmation) {
        User user = new User(1, email, password, passwordConfirmation);
        return user;
    }

//    @RequestMapping("/login")

//    @RequestMapping("/login")

}
