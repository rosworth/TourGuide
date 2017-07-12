package com.example.android.tourguide;

public class Location {
    private String name;
    private String address;
    private String contact;
    private String details;
    private int imageId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Location() {
    }

    public Location(String name, String address, String contact) {
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public Location(String name, String address, String contact, String details) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.details = details;
    }

    public Location(String name, String address, String contact, int image) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        imageId = image;
    }

    public Location(String name, String address, int image, String details) {
        this.name = name;
        this.address = address;
        this.details = details;
        imageId = image;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public int getImageId() {
        return imageId;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE;
    }

    public String getDetails() {
        return details;
    }
}
