package com.SpringBoot.SpringBoot_aws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @RequestMapping("/getname")
    public String getName() {
    	return "Rakesh";
    }
}
