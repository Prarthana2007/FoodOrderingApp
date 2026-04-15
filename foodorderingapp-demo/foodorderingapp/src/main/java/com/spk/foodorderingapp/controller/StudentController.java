package com.spk.foodorderingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spk.foodorderingapp.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    // Login
    @GetMapping("/login")
    public String login() {
        return service.login();
    }

    // Place Order
    @PostMapping("/order")
    public String placeOrder(@RequestParam int orderId) {
        return service.placeOrder(orderId);
    }

    // View Orders
    @GetMapping("/orders")
    public String viewOrders() {
        return service.viewOrders();
    }
}
