package com.codegym.model;

public class Product {
    private int id;
    private String name;
    //Giá sản phẩm
    private float price;
    //Mô tả sản phẩm
    private String desscribe;
    //Mô tả nhà sản xuất
    private String producer;
    private String avatar;


    public Product() {
    }

    public Product(int id,String name, float price, String desscribe, String producer,String avatar){
        this.id = id;
        this.name = name;
        this.price= price;
        this.desscribe = desscribe;
        this.producer = producer;
        this.avatar = avatar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDesscribe() {
        return desscribe;
    }

    public void setDesscribe(String desscribe) {
        this.desscribe = desscribe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}