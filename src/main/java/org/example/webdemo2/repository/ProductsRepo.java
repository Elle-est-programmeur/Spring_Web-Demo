package org.example.webdemo2.repository;

import org.example.webdemo2.model.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<products, Integer> {
}
