package com.searchinghouses.controllers;

import com.searchinghouses.exception.HouseNotFoundException;
import com.searchinghouses.house.House;
import com.searchinghouses.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class HouseController {

    @Autowired
    HouseRepository houseRepository;

    @GetMapping("/test")
    public String welcome(){
        return "test";
    }

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




