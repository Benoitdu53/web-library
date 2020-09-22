package com.web.library.weblibrary.controller;

import com.web.library.weblibrary.proxies.EmpruntProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class EmpruntController {

    // ----- Injections des dépendances ----- //

    @Autowired
    private EmpruntProxy empruntProxy;

    // ----- ----- //

    @RequestMapping(value = "/emprunt/{idSession}", method = RequestMethod.GET)
    public String displayEmprunt(HttpSession httpSession,
                                 @PathVariable("idSession")Long idSession,
                                 Model model){

        model.addAttribute("emprunt",empruntProxy.listEmpruntByCustomer(idSession));

        return "emprunts";
    }
}
