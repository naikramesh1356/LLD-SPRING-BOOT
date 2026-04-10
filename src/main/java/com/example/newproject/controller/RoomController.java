package com.example.newproject.controller;


import com.example.newproject.dto.AddRoomRequestDto;
import com.example.newproject.model.Room;
import com.example.newproject.service.RoomService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
public class RoomController {
    
    private final RoomService roomService;
    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }
    
    @PostMapping
    public Room addRoom(@RequestBody AddRoomRequestDto request){
        return roomService.addRoom(request);
    }
    @GetMapping("/test")
    public String test() {
        return "Working!";
    }
}

