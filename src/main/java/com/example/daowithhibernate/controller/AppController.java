package com.example.daowithhibernate.controller;

import com.example.daowithhibernate.entity.Persons;
import com.example.daowithhibernate.service.AppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    private final AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getCityes(@RequestParam("city") String city) {
        return appService.getcity_of_living(city);
    }
}

