package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {

    private  MyDate orderDate;
    private double orderAmount = 0.00;
    private  String customer;
    private String product;
    private int quantity;

    public static double taxRate;

    static {

        taxRate = 0.05;

    }

    public MyDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(MyDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        if (orderAmount > 0) {
            this.orderAmount = orderAmount;
        } else {
            System.out.println("Attempting to set order amount lessthan or equal to zero");
        }
    }
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0) {


            this.quantity = quantity;
        }else{
            System.out.println("Attempting to set quantity less than or equal to zero");
        }
    }

    public static double getTaxRate() {
        return taxRate;
    }
    public static void setTaxRate(double newRate) {
        taxRate = newRate;

    }
    public double computeTax() {
        System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
        return orderAmount * Order.taxRate;
    }

    public Order(MyDate d, double amt, String c, String p, int q) {
        this.orderDate = d;
        this.orderAmount = amt;
        this.customer = c;
        this.product = p;
        this.quantity = q;
    }

    public String toString() {
        return quantity + " ea. " + product + " for " + customer;
    }

    public static void computeTaxOn(double amount) {
        System.out.println("The tax for " + amount + "is: " + amount * Order.taxRate);
    }



    public char jobSize() {
        if (quantity <= 25) {
            return 'S';
        } else if (quantity <= 76) {
            return 'M';
        } else if (quantity <= 150) {
            return 'L';
        }

        return 'X';

    }

    public double computeTotal() {
        double total = orderAmount;
        switch (jobSize()) {
            case 'M':
                total = total - (orderAmount * 0.01);
                break;
            case 'L':
                total = total - (orderAmount * 0.02);
                break;
            case 'X':
                total = total - (orderAmount * 0.03);
                break;
        }
        // Order with orderAmount >1500 will get tax discount

        if (orderAmount <= 1500) {
            total = total + computeTax();
        }
        return total;
    }



}
