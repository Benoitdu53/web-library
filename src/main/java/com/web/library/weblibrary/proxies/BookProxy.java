package com.web.library.weblibrary.proxies;


import com.web.library.weblibrary.beans.Book;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "library", url = "localhost:8181")
public interface BookProxy {

    @GetMapping(value = "/books")
    List<Book> listBooks();

    @GetMapping(value = "/book/{id}")
    Book getBookById(@PathVariable("id") Long id);

    @GetMapping(value = "books/{categorie}")
    List<Book> listBooksByCategorie(@PathVariable("categorie") String categorie);
}
