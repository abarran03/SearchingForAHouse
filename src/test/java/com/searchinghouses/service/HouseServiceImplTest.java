package com.searchinghouses.service;

import com.searchinghouses.exception.HouseNotFoundException;
import com.searchinghouses.house.House;
import com.searchinghouses.repository.HouseRepository;
import com.searchinghouses.services.HouseService;
import com.searchinghouses.services.HouseServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class HouseServiceImplTest {

    @TestConfiguration
    static class HouseServiceImplTestContextConfiguration {

        @Bean
        public HouseService houseService() {
            return new HouseServiceImpl();
        }
    }

    @Autowired
    private HouseService houseService;

    @MockBean
    private HouseRepository houseRepository;

    @Test
    public void test_find_house_by_id() throws HouseNotFoundException {
        House house = new House("1230","Masion");
        Mockito.when(houseRepository.findById("1230")).thenReturn(java.util.Optional.of(house));
        Optional<House> found = Optional.ofNullable(houseService.findHouseById("1230"));
        assertThat(Boolean.TRUE.equals(found.isPresent()));
    }

    @Test
    public void test_find_all_houses() {
        List<House> houseList = List.of(new House("1230","Masion"));
        Mockito.when(houseRepository.findAll()).thenReturn(houseList);
        assertThat(Boolean.TRUE.equals(!houseService.findAllHouses().isEmpty()));
    }

    @Test
    public void test_save_house() {
        House house = new House("1230","Masion");
        Mockito.when(houseRepository.save(house)).thenReturn(house);
        Optional<House> found = Optional.ofNullable(houseService.addHouse(house));
        assertThat(Boolean.TRUE.equals(found.isPresent()));
    }

    @Test
    public void test_delete_house() {
        houseService.deleteHouseById("1230");
    }
}
