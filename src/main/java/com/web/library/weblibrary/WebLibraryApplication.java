package com.web.library.weblibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.web.library")
public class WebLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebLibraryApplication.class, args);
    }

}
