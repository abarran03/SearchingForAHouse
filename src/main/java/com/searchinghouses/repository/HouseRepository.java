package com.searchinghouses.repository;

import com.searchinghouses.house.House;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HouseRepository extends MongoRepository<House, String> {



}
