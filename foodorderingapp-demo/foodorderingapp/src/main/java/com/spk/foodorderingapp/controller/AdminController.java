package com.spk.foodorderingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spk.foodorderingapp.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService service;

    // Add Item
    @PostMapping("/add-item")
    public String addItem() {
        return service.addItem();
    }

    // View Menu
    @GetMapping("/menu")
    public String viewMenu() {
        return service.viewMenu();
    }
}
