package com.example.samplejenkins.services;

import com.example.samplejenkins.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public List<Person> getPersons() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"pawan kalyan", "konidela", "1955-08-22"));
        personList.add(new Person(2, "chiranjeevi", "konidela", "1971-09-02"));
        personList.add(new Person(3, "nagababu", "konidela", "1961-10-19"));
        return personList;
    }
}
