package com.gumen.springbootedu.entity;

public class Product {
    private Integer id;
    private String Title;
    private double cost;

    public Product() {

    }
    public Product(String title, double cost) {
        Title = title;
        this.cost = cost;
    }

    public Product(int id, String title, double cost) {
        this.id = id;
        Title = title;
        this.cost = cost;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
