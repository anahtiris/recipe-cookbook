package com.recipe.cookbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stiranardvanich on 01.12.2017.
 */

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody String sayHello() {
        return "Hello World";
    }

}
