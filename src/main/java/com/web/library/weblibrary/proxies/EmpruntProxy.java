package com.web.library.weblibrary.proxies;

import com.web.library.weblibrary.beans.Customer;
import com.web.library.weblibrary.beans.Emprunt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "library", url = "localhost:8181")
public interface EmpruntProxy {

    @GetMapping(value = "/emprunts/{id}")
    List<Emprunt> listEmpruntByCustomer(@PathVariable("id") Long id);

    // Rajouter un prêt
    @PostMapping(value = "/emprunt/add")
    Emprunt createEmprunt ( @RequestParam String format, @RequestParam String nameLibrary, Customer customer);
}
