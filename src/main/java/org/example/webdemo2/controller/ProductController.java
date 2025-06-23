package org.example.webdemo2.controller;

import org.example.webdemo2.service.ProductService;
import org.example.webdemo2.model.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/products")
    public List<products> getProducts(){
        return productService.getProducts();
    }
    @GetMapping("/products/{productId}")
    public products getProductById(@PathVariable int productId){
        return productService.getProductById(productId);
    }

//    @GetMapping("/products1/{productName}")
//    public products getProductByName(@PathVariable String productName){
//        return productService.getProductByPrice(Integer.parseInt(productName));
//    }
//
//    @GetMapping("/products3/{productPrice}")
//    public products getProductByName(@PathVariable int productPrice){
//        return productService.getProductByPrice(productPrice);
//    }

    @PostMapping("/product")
    public void addProduct(@RequestBody products prod){
        productService.addProduct(prod);
    }
    @PostMapping("/products")
    public void addProducts(@RequestBody List<products> prod){
        productService.addProducts(prod);
    }

    @PutMapping("/products")
    public void updateProducts(@RequestBody products prod){
        productService.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodID}")
    public void deleteProducts(@PathVariable int prodID){
        productService.deleteProduct(prodID);
    }
}
