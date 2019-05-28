package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class controller {

    @RequestMapping(method = RequestMethod.GET, value = "/api/getdata")
    public String getData(){
        String json = "{\n" +
                "   \"name\": \"khang dao\"\n" +
                "}";
        return json;
    }

}
