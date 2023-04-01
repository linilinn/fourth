package com.example.fourth.adapter;

public class Food {
    private String food;
    private int imageResource;


    public Food(String food, int imageResource) {
        this.food = food;
        this.imageResource = imageResource;
    }

    public String getFood() {
        return food;
    }

    public int getImageResource() {
        return imageResource;
    }
}
