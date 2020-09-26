package com.web.library.weblibrary.proxies;

import com.web.library.weblibrary.beans.AuthenticationCustomer;
import com.web.library.weblibrary.beans.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "library", url = "localhost:8181")
public interface CustomerProxy {

    @PostMapping(value = "/user")
    Customer getCustomerByEmail(String email);

    @PostMapping(value = "/users")
    Customer createCustomer(@ModelAttribute("user") Customer customer);

    @PostMapping(value = "/validationAuthentication")
    Customer validationAuthentication(@ModelAttribute("authentication") AuthenticationCustomer authenticationCustomer);
}
