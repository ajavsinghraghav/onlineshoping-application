package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.controller;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.exception.PriceNotFoundException;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.Price;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service.PriceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prices")
public class PriceController {
    private PriceService priceService;
    public PriceController(PriceService priceService){
        this.priceService=priceService;
    }
    @GetMapping
    public List<Price> getAllPrices(){
        return priceService.getAllPrices();
    }
    @GetMapping("/{priceId}")
    public ResponseEntity<Price> getPriceById(@PathVariable Long priceId){
        Price price=priceService.getPriceByid(priceId)
                .orElseThrow(()->new PriceNotFoundException("price not found with id:"+priceId));
        return ResponseEntity.ok(price);



    }
    @PostMapping
    public ResponseEntity<Price>CreatePrice(@RequestBody Price price){
        Price createdPrice=priceService.createPrice(price);
        return new ResponseEntity<>(createdPrice, HttpStatus.CREATED);
    }
    @PutMapping("/{priceId}")
    public  ResponseEntity<Price>updatePrice(@PathVariable Long priceId,@RequestBody Price pricedetails){
        Price updatedprice=priceService.updatePrice(priceId,pricedetails);
        return ResponseEntity.ok(updatedprice);

    }
    @DeleteMapping("/{priceId}")
    public ResponseEntity<Optional>deletePrice(@PathVariable Long priceId){
        priceService.deletePrice(priceId);
        return ResponseEntity.noContent().build();
    }

}
