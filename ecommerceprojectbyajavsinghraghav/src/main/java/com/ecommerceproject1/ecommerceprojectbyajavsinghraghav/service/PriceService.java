package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.exception.PriceNotFoundException;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.Price;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.repository.PriceRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PriceService {
    private PriceRepository priceRepository;
    public PriceService(PriceRepository priceRepository){
        this.priceRepository=priceRepository;
    }

    public List<Price> getAllPrices(){
        return priceRepository.findAll();
    }
    public Optional<Price>getPriceByid(Long id){
        return priceRepository.findById(id);
    }
    public Price createProduct(Price price) {
        return  priceRepository.save(price);
    }
    public Price updatePrice(Long id,Price priceDetails){
        Price existingPrice=priceRepository.findById(id)
                .orElseThrow(()-> new PriceNotFoundException(" price not found with id:"+id));
        existingPrice.setPrice(priceDetails.getPrice());
        return  priceRepository.save(existingPrice);
    }


    @PostMapping
    public Price createPrice(Price price) {
        return priceRepository.save(price);

    }

    public void deletePrice(Long priceId) {
        Optional<Price>priceOptional=priceRepository.findById(priceId);
        if(priceOptional.isPresent()){
            priceRepository.deleteById(priceId);
        }else {
            throw new PriceNotFoundException("Price with id"+priceId+"not found");
        }
    }


    //private RuntimeException PriceNotFoundException(String s) {
    //}


}
