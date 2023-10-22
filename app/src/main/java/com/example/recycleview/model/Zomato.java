package com.example.recycleview.model;

public class Zomato {

    private String name;
    private String rating;
    private String price;
    private int image;

    public Zomato(String name, String rating, String price, int image) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.image = image;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
