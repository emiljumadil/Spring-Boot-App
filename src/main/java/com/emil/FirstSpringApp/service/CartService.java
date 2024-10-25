package com.emil.FirstSpringApp.service;


import org.springframework.stereotype.Service;

@Service
public class CartService {
    public String getCart() {
        return "It is your Cart";
    }
}
