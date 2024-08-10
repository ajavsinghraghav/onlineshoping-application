package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.exnum.ProductType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter

@Entity(name="products")
public  abstract class Product extends BaseModel {
    private String name;
    private String brand;
    private  String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Category category;

   @Enumerated(EnumType.STRING)
    private ProductType type;

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Price price;
    @OneToOne( mappedBy = "product",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Inventry inventry;
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<Attribute>attributes;

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    //public Double getPrice() {
//        return price;
//    }

    //public void setPrice(Double price) {
      //  this.price = price;
    //}

    public Inventry getInventry() {
        return inventry;
    }

    public void setInventry(Inventry inventry) {
        this.inventry = inventry;
    }
}
