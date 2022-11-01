package com.example.foodatorapp.Domain;

public class FoodDomain {
    private String title;
    private String pic;
    private String description;
    private Double free;
    private int numberInCart;

    public FoodDomain(String title, String pic, String description, Double free) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.free = free;
    }

    public FoodDomain(String title, String pic, String description, Double free, int numberInCart) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.free = free;
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFree() {
        return free;
    }

    public void setFree(Double free) {
        this.free = free;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}
