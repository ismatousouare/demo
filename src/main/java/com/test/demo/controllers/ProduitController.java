package com.test.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.models.Produit;
import com.test.demo.services.ProduitService;

//import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/produit")
//@AllArgsConstructor
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@PostMapping("/create")
	public Produit createProduit(@RequestBody Produit produit) {
		return produitService.create(produit);
	}
	
	
	@GetMapping("/read")
	public List<Produit> readProduit(){
		return produitService.read();
	}
	
	@PutMapping("/update/{id}")
	public Produit updateProduit(@PathVariable Long id,@RequestBody Produit produit) {
		return produitService.update(id, produit);
	}
	@DeleteMapping("/delete")
	public String deleteProduit(@PathVariable Long id) {
		return produitService.delete(id);
	}

}
