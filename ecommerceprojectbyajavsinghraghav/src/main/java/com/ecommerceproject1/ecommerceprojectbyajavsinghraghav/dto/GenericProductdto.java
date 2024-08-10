package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericProductdto {
    private  Long id;
    private String title;
    private  String description;
    private String image;
    private String category;
    private double price;
}
