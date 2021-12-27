package com.gumen.springbootedu.repository;

import com.gumen.springbootedu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public class productRepo {
    private List<Product> productRepo;

    @Autowired
    public productRepo(List<Product> productRepo) {
        this.productRepo = productRepo;
        productRepo.add(new Product(0,"coco",192));
        productRepo.add(new Product(1,"apple",168));
        productRepo.add(new Product(2,"pear",1));
        productRepo.add(new Product(3,"pineapple",36));
        productRepo.add(new Product(4,"beef",255));
        productRepo.add(new Product(5,"eggs",255));
        productRepo.add(new Product(6,"orange",255));
        productRepo.add(new Product(7,"lemon",0));
    }

    public Optional<Product> getProductById(int id){
        return productRepo.stream()
                .filter(product -> product.getId()==id)
                .findFirst();
    }

    public List<Product> getAll() {
        return productRepo;
    }

    public void addNewProduct(Product prod) {
        productRepo.add(prod);
    }
}
