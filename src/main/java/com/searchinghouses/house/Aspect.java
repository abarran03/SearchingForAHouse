package com.searchinghouses.house;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

public class Aspect {
       public Aspect(){
              this.id = UUID.randomUUID().toString();
       }

       public String id;

       private String description;

       public String getDescription() {
              return description;
       }

       public void setDescription(String description) {
              this.description = description;
       }


}
