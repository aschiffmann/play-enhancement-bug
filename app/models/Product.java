package models;

import play.core.enhancers.PropertiesEnhancer;

public class Product {

    public String name;
    @PropertiesEnhancer.GeneratedSetAccessor
    public Integer price;

    public void setPrice(Integer price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can’t be negative!");
        }
        this.price = price;
    }
}