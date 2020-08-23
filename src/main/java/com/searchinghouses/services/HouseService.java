package com.searchinghouses.services;

import com.searchinghouses.exception.HouseNotFoundException;
import com.searchinghouses.house.House;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

public interface HouseService {

    Collection<House> findAllHouses();

    House addHouse(@RequestBody House house);

    House findHouseById(@PathVariable String id) throws HouseNotFoundException;

    void deleteHouseById(@PathVariable String id);

    void updateHouse(@RequestBody House house);
}
