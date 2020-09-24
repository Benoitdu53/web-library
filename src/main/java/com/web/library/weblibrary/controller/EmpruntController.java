package com.web.library.weblibrary.controller;

import com.web.library.weblibrary.beans.Customer;
import com.web.library.weblibrary.beans.Emprunt;
import com.web.library.weblibrary.proxies.CopyProxy;
import com.web.library.weblibrary.proxies.EmpruntProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmpruntController {

    // ----- Injections des dépendances ----- //

    @Autowired
    private EmpruntProxy empruntProxy;

    @Autowired
    private CopyProxy copyProxy;

    // ----- ----- //

    /**
     * Affiche les prêts de l'utilisateur
     * @param httpSession
     * @param idSession
     * @param model
     * @return
     */
    @RequestMapping(value = "/emprunt/{idSession}", method = RequestMethod.GET)
    public String displayEmprunt(HttpSession httpSession,
                                 @PathVariable("idSession")Long idSession,
                                 Model model){

        List<Emprunt> emprunts = empruntProxy.listEmpruntByCustomer(idSession);

        model.addAttribute("emprunt",emprunts);

        return "emprunts";
    }

    @RequestMapping(value = "/emprunt/add", method = RequestMethod.POST)
    public String empruntCopy(HttpSession httpSession,
                              @RequestParam(value = "format", required = false) String format,
                              @RequestParam(value = "nameLibrary", required = false) String nameLibrary,
                              @SessionAttribute("session") Customer customer,
                              Model model){

        Emprunt emprunt = empruntProxy.createEmprunt(format, nameLibrary, customer);

       model.addAttribute("emprunt", empruntProxy.listEmpruntByCustomer(customer.getId()));

        return "emprunts";
    }
}
