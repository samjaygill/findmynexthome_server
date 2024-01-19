package com.gillies.findmynexthome.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_id")
    private int id;
    @Column(name = "address")
    private String address;
    @Column(name = "type")
    private String type;
    @Column(name = "bedrooms")
    private int bedrooms;
    @Column(name = "bathrooms")
    private int bathrooms;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "imageUrls")
    private List<String> imageUrls;

    public Property(int id, String address, String type, int bedrooms, int bathrooms, String description, double price, List<String> imageUrls) {
        this.id = id;
        this.address = address;
        this.type = type;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.description = description;
        this.price = price;
        this.imageUrls = imageUrls;
    }

    public Property() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }
}
