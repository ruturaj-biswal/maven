package com.ruturaj.simpleWebApp.repository;

import com.ruturaj.simpleWebApp.Model.Product;   // ✅ IMPORTANT: FIX THIS IMPORT
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
