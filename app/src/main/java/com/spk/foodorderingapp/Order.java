package com.spk.foodorderingapp;

import java.time.LocalDateTime;
import java.util.*;

public class Order {

    private int orderId;
    private List<OrderItem> items;
    private double totalAmount;
    private String status;
    private LocalDateTime orderTime;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.status = "Placed";
        this.orderTime = LocalDateTime.now();
    }

    public void addItem(OrderItem item) {
    }

    public void displayOrder() {
    }

    public void cancelOrder() {
    }

    public String getStatus() {
        return status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
