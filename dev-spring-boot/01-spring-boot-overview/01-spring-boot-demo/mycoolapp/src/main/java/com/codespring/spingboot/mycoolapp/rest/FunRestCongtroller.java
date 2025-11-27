package com.codespring.spingboot.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestCongtroller {

    // response / return "Hello World'

    @GetMapping
    public String GetValue() {
        return "Hello World1";
    }

}
