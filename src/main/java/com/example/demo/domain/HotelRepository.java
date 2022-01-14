package com.example.demo.domain;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface HotelRepository extends JpaRepository<Hotel,Long> {

    @EntityGraph(attributePaths = "roomList")
    List<Hotel> findAll();


}
