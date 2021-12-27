package com.gumen.springbootedu.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String Title;

    @Column(name = "price")
    private double cost;

    public Product() {

    }
    public Product(String title, double cost) {
        Title = title;
        this.cost = cost;
    }

    public Product(long id, String title, double cost) {
        this.id = id;
        Title = title;
        this.cost = cost;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
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
