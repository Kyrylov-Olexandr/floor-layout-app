package com.main.floorlayoutapp;

import com.main.floorlayoutapp.Repositories.CoordinatesRepository;
import com.main.floorlayoutapp.Repositories.RoomRepository;
import com.main.floorlayoutapp.models.Coordinates;
import com.main.floorlayoutapp.models.Room;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

@Component
public class Sevice {
    private RoomRepository roomRepo;
    private CoordinatesRepository coordRepo;
    private static final AtomicInteger ID_HOLDER = new AtomicInteger();

    public Sevice(RoomRepository roomRepository) {
        this.roomRepo = roomRepository;
    }

//    public List<Coordinates> read(int id) {
//
//    }

    public Room save(Room room) {

        final int id = ID_HOLDER.incrementAndGet();
        room.setId(id);
        roomRepo.save(room);
        return room;
    }
    public boolean validation (List<Coordinates> coord) {
        for(int i = 0; i < coord.size(); i++) {
            int x1 = coord.get(i).getX();
            int y1 = coord.get(i).getY();
            int x2 = coord.get(i+1).getX();
            int y2 = coord.get(i+1).getY();
            if (x1 == x2 || y1 == y2) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
