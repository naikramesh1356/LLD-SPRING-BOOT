package com.example.newproject.model;

import static com.sun.beans.introspect.PropertyInfo.Name.description;

public class Room {
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String name;
    public String description;
    public double price;
    public String roomType;
}


//
////Getter & Setters
//
//public int getId() {return id;}
//public void setId(int id) {this.id=id}
//
//public String getName() {return name;}
//public void setName(String name) {this.name=name;}
//
//public String getDescription() {return description;}
//public void setDescription(String description) {this.getDescription() = description;}
//
//public double getPrice() {return price;}
//public void setPrice(double price) {this.price = price;}
//
//public String getRoom() {return roomType;}
//public void setRoomType(String roomType) {this.setRoomType;}


