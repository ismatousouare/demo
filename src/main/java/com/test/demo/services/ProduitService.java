package com.test.demo.services;

import java.util.List;

import com.test.demo.models.Produit;

public interface ProduitService{
	
	Produit create(Produit produit);
	List<Produit> read();
	Produit update(Long id, Produit produit);
	String delete(Long id);
	

}
