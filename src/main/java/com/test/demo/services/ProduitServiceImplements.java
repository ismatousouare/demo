package com.test.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.models.Produit;
import com.test.demo.repository.ProduitRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProduitServiceImplements implements ProduitService {
	
	
	@Autowired
	private ProduitRepository produitRepository;
	//private final ProduitRepository produitRepository = null;


	@Override
	public Produit create(Produit produit) {
		
		return produitRepository.save(produit);	}

	@Override
	public List<Produit> read() {
	
		return produitRepository.findAll();
	}

	@Override
	public Produit update(Long id, Produit produit) {
		
		return produitRepository.findById(id)
				.map(p->{
					p.setPrix(produit.getPrix());
					p.setNom(produit.getNom());
					p.setDescription(produit.getDescription());
					return produitRepository.save(p);
				}).orElseThrow(()->new RuntimeException("Produit introuvable"));
	}

	@Override
	public String delete(Long id) {
		
		produitRepository.deleteById(id);
		return "le produit a ete supprimer";
	}

	

}
