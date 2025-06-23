package org.example.webdemo2.service;

import org.example.webdemo2.model.products;
import org.example.webdemo2.repository.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {
//    List<products> productsList = new ArrayList<>(Arrays.asList(new products(101, "Mobile", 150000),
//            new products(102, "Laptop", 300000),
//            new products(103, "TV", 798089)));
    @Autowired
    ProductsRepo repo;
    public List<products> getProducts(){
//        return productsList;
        return repo.findAll();
    }
    public products getProductById(int productId){
//        return productsList.stream()
//                .filter(p -> p.getProductId() == productId)
//                .findFirst().get();
        return repo.findById(productId).get();
    }

//    public products getProductByName(String productName) {
////        return productsList.stream()
////                .filter(p -> Objects.equals(p.getProductName(), productName))
////                .findFirst().get();
//    }

//    public products getProductByPrice(int productPrice) {
//        return productsList.stream()
//                .filter(p -> p.getProductPrice() == productPrice)
//                .findFirst().get();
//    }

    public void addProduct(products products) {
//        productsList.add(products);
        repo.save(products);
    }

    public void updateProduct(products products) {
//        int index = 0;
//        for(int i = 0; i < productsList.size(); i++){
//            if(productsList.get(i).getProductId() == products.getProductId()){
//                index = i;
//            }
//        }
//        productsList.set(index, products);
        repo.save(products);
    }
//    public int getIndexOfProduct(products products) {
//        int index = 0;
//        for(int i = 0; i < productsList.size(); i++){
//            if(productsList.get(i).getProductId() == products.getProductId()){
//                index = i;
//            }
//        }
//        return index;
//    }

    public void deleteProduct(int prodID) {
//        int index = 0;
//        for(int i = 0; i < productsList.size(); i++){
//            if(productsList.get(i).getProductId() == prodID){
//                index = i;
//            }
//        }
//        productsList.remove(index);
        repo.deleteById(prodID);
    }

    public void addProducts(List<products> prod) {
        repo.saveAll(prod);
    }
}
