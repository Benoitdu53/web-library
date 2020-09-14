package com.web.library.weblibrary.controller;

import com.web.library.weblibrary.beans.User;
import com.web.library.weblibrary.proxies.UserProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    // ----- Injections des dépendances ----- //
    @Autowired
    private UserProxy userProxy;

    // ---------- //

    @RequestMapping(value = "/authentification", method = RequestMethod.GET)
    public String authentificationUser(){

        return "registationUser";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
        public String createUser(@ModelAttribute("user") User user){

        userProxy.createUser(user);

        return "books";
    }




}
