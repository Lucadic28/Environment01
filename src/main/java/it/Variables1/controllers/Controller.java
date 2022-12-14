package it.Variables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Environment environment;
    @GetMapping
    public String getInfo(){
        String s = environment.getProperty("myCustomVarTree.authCode") + environment.getProperty("myCustomVarTree.devName");
    return s;
}
}
