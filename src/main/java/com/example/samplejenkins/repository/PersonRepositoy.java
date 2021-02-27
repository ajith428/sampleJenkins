package com.example.samplejenkins.repository;

import com.example.samplejenkins.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoy extends JpaRepository<Person, Long> {
}
