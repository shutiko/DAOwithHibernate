package com.example.daowithhibernate;

import com.example.daowithhibernate.entity.Persons;
import com.example.daowithhibernate.repository.AppRepository;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DaOwithHibernateApplication  {


    public static void main(String[] args) {
        SpringApplication.run(DaOwithHibernateApplication.class, args);

    }
}