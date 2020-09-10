package com.web.library.weblibrary.controller;

import com.web.library.weblibrary.beans.Book;
import com.web.library.weblibrary.proxies.BookProxy;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookController {

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

}
