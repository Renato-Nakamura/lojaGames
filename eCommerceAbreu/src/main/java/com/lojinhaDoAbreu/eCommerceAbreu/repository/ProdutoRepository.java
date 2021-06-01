package com.lojinhaDoAbreu.eCommerceAbreu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojinhaDoAbreu.eCommerceAbreu.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
