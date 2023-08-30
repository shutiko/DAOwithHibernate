package com.example.daowithhibernate.service;


import com.example.daowithhibernate.repository.AppRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AppService {
    private final AppRepository repositoryApp;


    public List<com.example.daowithhibernate.entity.Persons> getcity_of_living(String city) {
        return repositoryApp.getPersonsByCity(city);
    }

}

