package com.web.library.weblibrary.controller;

import com.web.library.weblibrary.beans.Book;
import com.web.library.weblibrary.proxies.BookProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    // ----- Injections des dépendances ----- //

    @Autowired
    private BookProxy bookProxy;

    @RequestMapping(value = "/books",method = RequestMethod.GET)
    public String getBooks(Model model){

        List<Book> books = bookProxy.listBooks();

        model.addAttribute("books", books);

        return "books";
    }

    @RequestMapping(value = "/books/{categorie}",method = RequestMethod.GET)
    public String getBookByCategorie(Model model,
                                     @PathVariable("categorie") String categorie){

        List<Book> books = bookProxy.listBooksByCategorie(categorie);

        model.addAttribute("books", books);

        return "books";
    }

    @RequestMapping(value = "/books/search", method = RequestMethod.POST)
    public String getBooksBySearch(@RequestParam(name = "saisie", defaultValue = "", required = false) String saisie,
                                   Model model){

        model.addAttribute("books", bookProxy.getBookBySearch(saisie));

        return "/books";
    }
}
