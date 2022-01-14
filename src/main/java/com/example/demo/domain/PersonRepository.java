package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findAll();
}


