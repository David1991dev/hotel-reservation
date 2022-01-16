package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface RoomRepository extends JpaRepository<Room,Long> {

    List<Room> findAll();

    @Override
    List<Room> findAllById(Iterable<Long> longs);

    Room findByRoomType(String roomType);




}
