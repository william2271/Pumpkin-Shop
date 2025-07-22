package com.pumpkin.demo.controllers;

import com.pumpkin.demo.models.Pumpkin;
import com.pumpkin.demo.services.PumpkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pumpkin")
public class PumpKinControllers {

    private final PumpkinService pumpkinService;

    @Autowired
    public PumpKinControllers(PumpkinService pumpkinService) {
        this.pumpkinService = pumpkinService;
    }


//Create a new pumpkin
    @PostMapping
    public void createPumpkin(@RequestBody Pumpkin pumpkin){
     pumpkinService.createPumpkin(pumpkin);
    }

    //Find all pumpkin
    public ResponseEntity<List<Pumpkin>> findAllPumpkin(){
        List<Pumpkin> pumpkin =pumpkinService.findAllPumpkin();
        return ResponseEntity.ok(pumpkin);

    }


}
