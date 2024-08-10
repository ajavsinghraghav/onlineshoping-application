package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="inventries")
public class Inventry extends BaseModel {
    private int total;
    private int available;
    private int reserved;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private  Product product;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }
}
