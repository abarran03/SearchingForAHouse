package com.searchinghouses.selling;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.nio.channels.SeekableByteChannel;
import java.util.Date;
import java.util.UUID;

public class SellingInfo {

    public SellingInfo(){
        this.id = UUID.randomUUID().toString();
        this.consultDate = new Date();
    }

    @Id
    public String id;
    private String linkInfo;
    private Date consultDate;
    private float price;
    private int residencyType;

    public String getLinkInfo() {
        return linkInfo;
    }

    public void setLinkInfo(String linkInfo) {
        this.linkInfo = linkInfo;
    }

    public Date getConsultDate() {
        return consultDate;
    }

    public void setConsultDate(Date consultDate) {
        this.consultDate = consultDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getResidencyType() {
        return residencyType;
    }

    public void setResidencyType(int residencyType) {
        this.residencyType = residencyType;
    }


}
