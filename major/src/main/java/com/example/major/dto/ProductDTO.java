package com.example.major.dto;

import com.example.major.model.Category;
import lombok.Data;

import javax.persistence.*;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;

}
