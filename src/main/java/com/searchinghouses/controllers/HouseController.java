package com.searchinghouses.controllers;

import com.searchinghouses.exception.HouseNotFoundException;
import com.searchinghouses.house.House;

import com.searchinghouses.services.HouseService;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;

@RestController
public class HouseController {

    @Autowired
    HouseService houseService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @Operation(summary = "Get all houses", tags = { "House" })
     @GetMapping("/houses")
    public Collection<House> allHouses(){
        return this.houseService.findAllHouses();
    }

    @Operation(summary = "Add house", tags = { "House" })
    @PostMapping("/houses")
    public House newHouse(@RequestBody House house) {
        return this.houseService.addHouse(house);
    }

    @Operation(summary = "Get house by id", tags = { "House" })
    @GetMapping("/houses/{id}")
    public House getAHouse(@PathVariable String id) throws HouseNotFoundException {
        return this.houseService.findHouseById(id);
    }

    @Operation(summary = "Delete a house", tags = { "House" })
    @DeleteMapping("/houses/{id}")
    public void deleteHouse(@PathVariable String id) {
        this.houseService.deleteHouseById(id);
    }

    @Operation(summary = "Update a house", tags = { "House" })
    @PutMapping("/houses/{id}")
    public void updateHouse(@RequestBody House house){
        this.houseService.updateHouse(house);
    }

}




