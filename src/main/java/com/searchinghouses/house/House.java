package com.searchinghouses.house;

import com.searchinghouses.selling.SellingInfo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class House {
    @Id
    public String id;
    private String description;

    private int roomsQuantity;
    private int parkingLotQuantity;
    private String buildingSize;
    private String propertySize;
    private int floors;
    private int bathroomQuantity;
    private String location;
    private List<Aspect> aspects;
    private SellingInfo sellingInfo;

    public String getId() {
        return id;
    }

    public House(
            String id,
            String description,
            int roomsQuantity,
            int parkingLotQuantity,
            String buildingSize,
            String propertySize,
            int floors,
            int bathroomQuantity,
            String location,
            List<Aspect> aspects,
            SellingInfo sellingInfo
    ){
        this.id = id;
        this.parkingLotQuantity = parkingLotQuantity;
        this.description = description;
        this.buildingSize = buildingSize;
        this.propertySize = propertySize;
        this.floors=floors;
        this.bathroomQuantity = bathroomQuantity;
        this.location =location;
        this.aspects = aspects;
        this.sellingInfo = sellingInfo;
    }

    public House(
            String id,
            String description
    ){
        this.id = id;
        this.description = description;
    }

    public House(

    ){

    }


    public SellingInfo getSellingInfo() {
        return sellingInfo;
    }

    public void setSellingInfo(SellingInfo sellingInfo) {
        this.sellingInfo = sellingInfo;
    }

    public int getParkingLotQuantity() {
        return parkingLotQuantity;
    }

    public void setParkingLotQuantity(int parkingLotQuantity) {
        this.parkingLotQuantity = parkingLotQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBuildingSize() { return buildingSize;}

    public void setBuildingSize(String buildingSize) {
        this.buildingSize = buildingSize;
    }

    public String getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(String propertySize) {
        this.propertySize = propertySize;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getBathroomQuantity() {
        return bathroomQuantity;
    }

    public void setBathroomQuantity(int bathroomQuantity) {
        this.bathroomQuantity = bathroomQuantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Aspect> getAspects() {
        return aspects;
    }

    public void setAspects(List<Aspect> aspects) {
        this.aspects = aspects;
    }

    public int getRoomsQuantity() {
        return roomsQuantity;
    }

    public void setRoomsQuantity(int roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }


    public String toString(){
        return this.id +' '+ this.description;
    }

}
