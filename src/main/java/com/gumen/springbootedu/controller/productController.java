package com.gumen.springbootedu.controller;

import com.gumen.springbootedu.entity.Product;
import com.gumen.springbootedu.service.productService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/products")
public class productController {

    private productService prodService;

    @GetMapping(value = { "/all" })
    public String productList(@RequestParam(required = false) Integer id, Model model) {
        List<Product> list;
        if (id!=null){
            list = new ArrayList<>();
            list.add(prodService.getProductByID(id));
        } else {
           list = prodService.getAllProducts();
        }

        model.addAttribute("products", list);

        return "product";
    }

    @GetMapping(value = {"/new"})
    public String addNewProduct(Model model){
        Product Product = new Product();
        model.addAttribute("Product", Product);
        return "newProductForm";
    }

    @PostMapping(value = {"/saveProduct"})
    public RedirectView saveProduct(Product product){
        prodService.addNewProduct(product);
        return  new RedirectView("all");
    }







}
