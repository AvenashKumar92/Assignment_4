package com.example.avenash_2.walmartextendedapp;

import android.os.Parcel;
import android.os.Parcelable;

class Product implements Parcelable {
    private String title;
    private double price;
    private String color;
    private String image;
    private int itemId;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(color);
        dest.writeString(image);
        dest.writeString(description);
        dest.writeInt(itemId);
        dest.writeDouble(price);
    }
}
