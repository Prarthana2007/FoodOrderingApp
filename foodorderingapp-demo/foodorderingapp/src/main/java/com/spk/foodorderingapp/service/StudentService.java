package com.spk.foodorderingapp.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String login() {
        return "Student logged in successfully";
    }

    public String placeOrder(int orderId) {
        return "Order placed with ID: " + orderId;
    }

    public String viewOrders() {
        return "Showing all orders";
    }
}
