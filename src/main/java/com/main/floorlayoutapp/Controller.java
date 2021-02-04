package com.main.floorlayoutapp;

import com.main.floorlayoutapp.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Sevice service;

    @Autowired
    public Controller(Sevice service) {
        this.service = service;
    }

//    @PostMapping(value = "/validateRoom")
//    public ResponseEntity<Room> save(@RequestBody Room room) {
//        service.save(room);
//
//    }

}
