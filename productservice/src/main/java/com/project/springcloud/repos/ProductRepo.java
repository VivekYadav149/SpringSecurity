package com.project.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
