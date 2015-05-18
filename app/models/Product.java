package models;

public class Product {

    public String name;
    public Integer price;

    public void setPrice(Integer price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can’t be negative!");
        }
        this.price = price;
    }
}

