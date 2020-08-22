package com.searchinghouses.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.searchinghouses.house.House;
import com.searchinghouses.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class HouseResolver implements GraphQLQueryResolver {
    @Autowired
    HouseRepository houseRepository;

    public List<House> getHouses(final int count) {
        return this.houseRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
    public Optional<House> getHouse(final String id) {
        return this.houseRepository.findById(id);
    }
}