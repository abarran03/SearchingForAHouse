package com.searchinghouses.controllers;

import com.searchinghouses.exception.HouseNotFoundException;
import com.searchinghouses.house.House;
import com.searchinghouses.repository.HouseRepository;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Collection;

@RestController
public class HouseController {

    @Autowired
    HouseRepository houseRepository;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @Operation(summary = "Get all houses", tags = { "House" })
     @GetMapping("/houses")
    public Collection<House> allHouses(){
        return this.houseRepository.findAll();
    }

    @PostMapping("/houses")
    public House newHouse(@RequestBody House house) {
        return this.houseRepository.save(house);
    }
    @GetMapping("/houses/{id}")
    public House getAHouse(@PathVariable String id) throws HouseNotFoundException {
        return this.houseRepository.findById(id).orElseThrow(HouseNotFoundException::new);
    }

    @DeleteMapping("/houses/{id}")
    public void deleteHouse(@PathVariable String id) {
        this.houseRepository.deleteById(id);
    }

    @PutMapping("/houses/{id}")
    public void updateHouse(@RequestBody House newHouse, @PathVariable String id){
        this.houseRepository.save(newHouse);
    }

}




