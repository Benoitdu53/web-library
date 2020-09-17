package com.web.library.weblibrary.controller;

import com.web.library.weblibrary.beans.Customer;
import com.web.library.weblibrary.proxies.CustomerProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    // ----- Injections des dépendances ----- //
    @Autowired
    private CustomerProxy customerProxy;

    // ---------- //

    @RequestMapping(value = "/authentification", method = RequestMethod.GET)
    public ModelAndView authentificationUser(Model model){

        model.addAttribute("user", new Customer());

        return new ModelAndView("registrationUser");
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
        public String createUser(@ModelAttribute("user") Customer customer){

        customerProxy.createUser(customer);

        return "redirect:/books";
    }




}
