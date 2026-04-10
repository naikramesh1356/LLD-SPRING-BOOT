package com.example.newproject.service;
import java.util.*;

import com.example.newproject.dto.AddRoomRequestDto;
import com.example.newproject.model.Room;
import com.example.newproject.model.User;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private Map<Integer, Room> roomDB = new HashMap<>();
    private Map<Integer, User> userDB = new HashMap<>();
    private int roomId = 1;

    public RoomService(){
        userDB.put(1, new User(1, "ADMIN"));
        userDB.put(2, new User(2, "USER"));
    }

    public Room addRoom(AddRoomRequestDto req){

        User user = userDB.get(req.userId);

        if (user == null){
            throw new RuntimeException("User not found");

        }
        if (!user.role.equals("ADMIN")){
            throw new RuntimeException("only admin can add room");
        }
        Room room =new Room();
        room.id = roomId++;
        room.description = req.description;
        room.price = req.price;
        room.roomType = req.roomType;
        roomDB.put(room.id, room);

        return room;


    }



}
