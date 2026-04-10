package com.example.newproject.repository;

import com.example.newproject.model.Room;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RoomRepositoryImpl implements RoomRepository {

    private final Map<Integer, Room> db = new HashMap<>();
    private int idCounter = 1;

    @Override
    public Room save(Room room) {
        room.setId(idCounter++);
        db.put(room.getId(), room);
        return room;
    }
}
