package com.searchinghouses.services;

import com.searchinghouses.exception.HouseNotFoundException;
import com.searchinghouses.house.House;
import com.searchinghouses.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Service
public class HouseServiceImpl implements HouseService{

    @Autowired
    private HouseRepository repository;


    public Collection<House> findAllHouses(){
        return this.repository.findAll();
    }

    public House addHouse(@RequestBody House house) {
        return this.repository.insert(house);
    }

    public House findHouseById(@PathVariable String id) throws HouseNotFoundException {
        return this.repository.findById(id).orElseThrow(HouseNotFoundException::new);
    }

    public void deleteHouseById(@PathVariable String id) {
        this.repository.deleteById(id);
    }

    public void updateHouse(@RequestBody House newHouse){
        this.repository.save(newHouse);
    }
}
