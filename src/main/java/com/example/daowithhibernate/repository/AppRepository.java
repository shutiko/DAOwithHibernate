package com.example.daowithhibernate.repository;

import com.example.daowithhibernate.entity.Persons;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.util.List;

@Data
@Repository
@AllArgsConstructor
@Transactional
@SpringBootApplication
public class AppRepository {
    @PersistenceContext
    public EntityManager entityManager;
    public List<Persons> getPersonsByCity(String city) {
        Query query = entityManager.createQuery("SELECT  p from Persons p where p.city_of_living = :city");
        query.setParameter("city", city);
        //System.out.println(query.getResultList());
        return query.getResultList();
    }

//    @PostConstruct
//    public void initialize() {
//        List<Persons> persons = List.of(
//                Persons.builder()
//                        .name("Ivan")
//                        .surname("Ivanov")
//                        .age(25)
//                        .phone_number("89254774535")
//                        .city_of_living("Moscow")
//                        .build(),
//                Persons.builder()
//                        .name("Petr")
//                        .surname("Petrov")
//                        .age(33)
//                        .phone_number("89154565568")
//                        .city_of_living("Riga")
//                        .build(),
//                Persons.builder()
//                        .name("Petr")
//                        .surname("Menshov")
//                        .age(21)
//                        .phone_number("89154544568")
//                        .city_of_living("Riga")
//                        .build(),
//                Persons.builder()
//                        .name("Evgeny")
//                        .surname("Lidov")
//                        .age(33)
//                        .phone_number("89189565568")
//                        .city_of_living("Irkutsk")
//                        .build(),
//                Persons.builder()
//                        .name("Evgeny")
//                        .surname("Muhin")
//                        .age(28)
//                        .phone_number("89185465568")
//                        .city_of_living("Izhevsk")
//                        .build()
//        );
//
//        persons.forEach(p -> entityManager.persist(p));
//    }
}