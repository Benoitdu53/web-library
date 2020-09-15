package com.web.library.weblibrary.proxies;

import com.web.library.weblibrary.beans.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "library", url = "localhost:8181")
public interface UserProxy {

    @PostMapping(value = "/users")
    User createUser(@ModelAttribute("user") User user);
}
