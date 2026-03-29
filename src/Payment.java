package com.spk;

public class Payment {

    private int paymentId;
    private double amount;
    private String status;

    public Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "Pending";
    }
    public void makePayment() {
    }
    public void verifyPayment() {
    }
}
