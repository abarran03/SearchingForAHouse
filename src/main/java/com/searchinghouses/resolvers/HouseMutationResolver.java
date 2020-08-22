package com.searchinghouses.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.searchinghouses.house.Aspect;
import com.searchinghouses.house.House;
import com.searchinghouses.repository.HouseRepository;
import com.searchinghouses.selling.SellingInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class HouseMutationResolver implements GraphQLMutationResolver {

    @Autowired
    HouseRepository houseRepository;

    public House createHouse(String description,
                             int roomsQuantity,
                             int parkingLotQuantity,
                             String buildingSize,
                             String propertySize,
                             int floors,
                             int bathroomQuantity,
                             String location,
                             List<Aspect> aspects,
                             SellingInfo sellingInfo)
    {


        House input = new House("",
                            description,
                            roomsQuantity,
                            parkingLotQuantity,
                            buildingSize,
                            propertySize,
                            floors,
                            bathroomQuantity,
                            location,
                            aspects,
                            sellingInfo
                        );
        return houseRepository.save(input);
    }



}

