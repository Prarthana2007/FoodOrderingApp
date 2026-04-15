package com.spk.foodorderingapp.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public String addItem() {
        return "Item added successfully";
    }

    public String viewMenu() {
        return "Menu displayed";
    }
}
