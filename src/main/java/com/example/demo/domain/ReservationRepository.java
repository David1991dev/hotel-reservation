package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ReservationRepository extends JpaRepository<Reservation, Long> {


}
