package com.test.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	
	

}
