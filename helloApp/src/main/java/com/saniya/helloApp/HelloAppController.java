package com.saniya.helloApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAppController {

    @GetMapping("/")
    public String getHome(){
        return "Hello from ci/cd pipeline.... hello hello ";
    }

}
