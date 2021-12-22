package com.gumen.springbootedu.service;

import com.gumen.springbootedu.entity.Product;
import com.gumen.springbootedu.repository.productRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class productService {
    private productRepo repo;


    public List<Product> getAllProducts(){
        return repo.getAll();
    }

    public Product getProductByID(int id){
        Optional<Product> oProduct = repo.getProductById(id);
        return oProduct.orElse(new Product(0, "none", 0));
    }

    public void addNewProduct(Product prod){
        prod.setId(repo.getAll().size()-1);
        repo.addNewProduct(prod);
    }


}
