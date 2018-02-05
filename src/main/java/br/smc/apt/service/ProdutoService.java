package br.smc.apt.service;

import br.smc.apt.domain.Produto;
import br.smc.apt.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Iterable<Produto> list(){
        return produtoRepository.findAll();
    }
    
    public Produto persist(Produto produto) {
    	produtoRepository.save(produto);
        return produto;
    }
    
    public void delete(Long produtoId) {
    	produtoRepository.delete(produtoId);
    }
}

