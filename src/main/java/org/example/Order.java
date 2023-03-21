package org.example;

public class Order {
    private String name;
    private int quantity;
    private double totalPrice;

    public Order() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + name + ", количество: " + quantity + ", общая стоимость: " + totalPrice;
    }
}